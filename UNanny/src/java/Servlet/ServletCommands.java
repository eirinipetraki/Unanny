package Servlet;

public class ServletCommands {
    public static final String param_CNTRL_Login = "CMD_LOGIN";
    public static final String param_CNTRL_Logout = "CMD_LOGOUT";
    public static final String param_CNTRL_Register = "CMD_REGISTER";
    public static final String param_CNTRL_StatusUpdate="CMD_STATUS_UPDATE";
    public static final String param_CNTRL_UpdateProfileStatus = "CMD_UPDATE_PROFILE_STATUS";
    public static final String param_CNTRL_GoToRegister = "CMD_GOTO_REGISTER";
    public static final String param_CNTRL_GoToProfile = "CMD_GOTO_PROFILE";
    public static final String param_CNTRL_GoToGallery = "CMD_GOTO_GALLERY";
    public static final String param_CNTRL_GoToTopics = "CMD_GOTO_TOPICS";
    
    public static final String param_CNTRL_GoToNewQuestion = "CMD_GOTO_NEWQUESTION";
    public static final String param_CNTRL_GoToExistingQuestion="CMD_GOTO_EXISTINGQUESTION";
    public static final String param_CNTRL_GoToTopicQuestions="CMD_GOTO_TOPICQUESTIONS";
    
    public static final String param_CNTRL_GoToNewAnswer = "CMD_GOTO_NEWANSWER";
    public static final String param_CNTRL_GoToExistingAnswer="CMD_GOTO_EXISTINGANSWER";
    
    public static final String param_CNTRL_GoToMessages = "CMD_GOTO_MESSAGES";
    public static final String param_CNTRL_Search = "CMD_SEARCH";
    public static final String param_CNTRL_SubmitTopic="CMD_SUBMIT_TOPIC";
    public static final String param_CNTRL_SubmitQuestion="CMD_SUBMIT_QUESTION";
    public static final String param_CNTRL_SubmitAnswear="CMD_SUBMIT_ANSWEAR";
    public static final String param_CNTRL_SubmitAnswearRating="CMD_SUBMIT_ANSWEAR_RATING";

    public static final String param_CNTRL_NewTopic="CMD_NEW_TOPIC";
    public static final String param_CNTRL_NewAnswer="CMD_NEW_ANSWER";
    public static final String param_CNTRL_NewQuestion="CMD_NEW_QUESTION";

    public static final String param_CNTRL_DeleteTopic="CMD_DELETE_TOPIC";
    public static final String param_CNTRL_DeleteAnswear="CMD_DELETE_ANSWER";
    public static final String param_CNTRL_DeleteQuestion="CMD_DELETE_QUESTION";

    /* Used for profile picture and photo gallery */
    public static final String param_CNTRL_UploadGalleryImage="CMD_UPLOAD_GALLERY_IMAGE";
    public static final String param_CNTRL_UploadProfileImage="CMD_UPLOAD_PROFILE_IMAGE";

    /* Used for Registration */
    public static final String paramUserName = "UserName";
    public static final String paramPassWord = "PassWord";
    public static final String paramFirstName = "FirstName";
    public static final String paramLastName = "LastName";
    public static final String paramCountry = "Country";
    public static final String paramInstitute = "Institute";
    public static final String paramDepartment = "Department";
    public static final String paramMail = "Mail";
    public static final String paramTelephone = "Telephone";
    public static final String paramBDate = "BirthDate";
    public static final String paramPicture = "PictureURI";
    public static final String paramGender = "Gender";
    public static final String paramMaster = "Master";
    
    /* Used to update profile status */
    public static final String paramProfileStatus = "ProfileStatus";

    /* Used to create new topic */
    public static final String paramTopicTitle="TopicTitle";
    public static final String paramTopicCategory="TopicCategory";
    public static final String paramTopicSubject="TopicSubject";
    public static final String paramTopicDescription="TopicDescription";
    public static final String attrTopicUUID = "TopicUUID";

    public static final String paramAnswearDescription="AnswearDescription";
    public static final String paramQuestionDescription="QuestionDescription";

    public static final String paramImage="Image";
    public static final String paramStatus="Status";

    /* Top <div> used for search. Available options: User, Topic */
    public static final String paramSearchContent="SearchContent";
    public static final String paramSearchType="SearchType";

    /* Photo gallery used for file upload constants */
    public static final String paramUploadProfilePicName="UploadProfilePicName";
    public static final String paramUploadGalleryPicName="UploadGalleryPicName";
    
    public static final String paramSubmitAnswerRating="SubmitAnswerRating";
    
    /* This field is used by photo gallery to return String[] of picture UUIDs */
    public static final String attrPhotoUUIDs="PhotoUUIDs";

    /* Used on the right panel to display info */
    public static final String attrUserAnswears="UserAnswears";
    public static final String attrUserQuestions="UserQuestions";
    public static final String attrUserTopics="UserTopics";
    
    /* Used on topics display */
    public static final String attrAllTopics="AllTopics";
    
    /*used on topic display*/
    public static final String attrTopic="SingleTopic";
    public static final String attrQuestion="SingleQuestion";
    public static final String attrAnswer="SingleAnswer";
    public static final String attrTopicQuestions="TopicQuestions";
    public static final String attrTopicAnswers="TopicAnswers";

    /* Used on the left panel to display info */
    public static final String attrUserContacts="UserContacts";
    public static final String attrUserInFriendRequests="UserInFriendRequests";
    public static final String attrUserOutFriendRequests="UserOutFriendRequests";
    public static final String attrUserSuggestedMembers="UserSuggestedMembers";

    public static final String attrUserName = "LoggedUserName";
    public static final String attrUserObject = "LoggedUserObject";
    public static final String attrConnector = "ConnectorDB";
    public static final String attrError = "ErrorName";
}
