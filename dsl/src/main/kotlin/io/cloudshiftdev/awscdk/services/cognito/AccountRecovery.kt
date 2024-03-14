package io.cloudshiftdev.awscdk.services.cognito

public enum class AccountRecovery(
    private val cdkObject: software.amazon.awscdk.services.cognito.AccountRecovery,
) {
    EMAIL_AND_PHONE_WITHOUT_MFA(
        software.amazon.awscdk.services.cognito.AccountRecovery.EMAIL_AND_PHONE_WITHOUT_MFA
    ),
    PHONE_WITHOUT_MFA_AND_EMAIL(
        software.amazon.awscdk.services.cognito.AccountRecovery.PHONE_WITHOUT_MFA_AND_EMAIL
    ),
    EMAIL_ONLY(software.amazon.awscdk.services.cognito.AccountRecovery.EMAIL_ONLY),
    PHONE_ONLY_WITHOUT_MFA(
        software.amazon.awscdk.services.cognito.AccountRecovery.PHONE_ONLY_WITHOUT_MFA
    ),
    PHONE_AND_EMAIL(software.amazon.awscdk.services.cognito.AccountRecovery.PHONE_AND_EMAIL),
    NONE(software.amazon.awscdk.services.cognito.AccountRecovery.NONE),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.cognito.AccountRecovery
        ): AccountRecovery =
            when (cdkObject) {
                software.amazon.awscdk.services.cognito.AccountRecovery
                    .EMAIL_AND_PHONE_WITHOUT_MFA -> AccountRecovery.EMAIL_AND_PHONE_WITHOUT_MFA
                software.amazon.awscdk.services.cognito.AccountRecovery
                    .PHONE_WITHOUT_MFA_AND_EMAIL -> AccountRecovery.PHONE_WITHOUT_MFA_AND_EMAIL
                software.amazon.awscdk.services.cognito.AccountRecovery.EMAIL_ONLY ->
                    AccountRecovery.EMAIL_ONLY
                software.amazon.awscdk.services.cognito.AccountRecovery.PHONE_ONLY_WITHOUT_MFA ->
                    AccountRecovery.PHONE_ONLY_WITHOUT_MFA
                software.amazon.awscdk.services.cognito.AccountRecovery.PHONE_AND_EMAIL ->
                    AccountRecovery.PHONE_AND_EMAIL
                software.amazon.awscdk.services.cognito.AccountRecovery.NONE -> AccountRecovery.NONE
            }

        internal fun unwrap(
            wrapped: AccountRecovery
        ): software.amazon.awscdk.services.cognito.AccountRecovery = wrapped.cdkObject
    }
}
