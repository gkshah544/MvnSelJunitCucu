  Feature:This feature will validates alertpage

    Scenario Outline: Users should able to navigate alert website and able to handle third alert btn
      Given uses navigates to demoqa website
      Then clicks on "<alertBtns>" alert page
      Then user should able to "<handleAlert>" the pop up alert page

      Examples:
        | alertBtns | handleAlert|
        |secondBtn  | acknowledge|
        |ThirdBtn   | dismiss    |
        |FourthBtn  | keywords   |


