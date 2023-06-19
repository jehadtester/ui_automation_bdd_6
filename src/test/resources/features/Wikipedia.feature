@Regression
Feature: Wiki search functionality

  Scenario Outline: Validate Wiki search
    Given user navigates to "http://www.wikipedia.org/"
    When user searches for "<input>" on Wikipedia
    Then user should see "<input>" in the title
    And user should see "<input>" in the url
    And user should see "<input>" in the first heading

    Examples:
    | input |
    | Elon Musk |
    | Morgan Freeman |
    | Ryan Cohen     |

    @Wiki
  Scenario: Validate Wikipedia main languages
    Given user navigates to "http://www.wikipedia.org/"
    Then user should see below languages around the logo
      | English |
      | 日本語 |
      | Español |
      | Русский |
      | Deutsch |
      | Français |
      | Italiano |
      | 中文 |
      | فارسی |
      | Português |

