@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import kotlin.Unit

/**
 * Triggers for a user pool.
 *
 * Example:
 *
 * ```
 * Function authChallengeFn = Function.Builder.create(this, "authChallengeFn")
 * .runtime(Runtime.NODEJS_LATEST)
 * .handler("index.handler")
 * .code(Code.fromAsset(join(__dirname, "path/to/asset")))
 * .build();
 * UserPool userpool = UserPool.Builder.create(this, "myuserpool")
 * // ...
 * .lambdaTriggers(UserPoolTriggers.builder()
 * .createAuthChallenge(authChallengeFn)
 * .build())
 * .build();
 * userpool.addTrigger(UserPoolOperation.USER_MIGRATION, Function.Builder.create(this,
 * "userMigrationFn")
 * .runtime(Runtime.NODEJS_LATEST)
 * .handler("index.handler")
 * .code(Code.fromAsset(join(__dirname, "path/to/asset")))
 * .build());
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html)
 */
public interface UserPoolTriggers {
  /**
   * Creates an authentication challenge.
   *
   * Default: - no trigger configured
   *
   * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-create-auth-challenge.html)
   */
  public fun createAuthChallenge(): IFunction? =
      unwrap(this).getCreateAuthChallenge()?.let(IFunction::wrap)

  /**
   * Amazon Cognito invokes this trigger to send email notifications to users.
   *
   * Default: - no trigger configured
   *
   * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-custom-email-sender.html)
   */
  public fun customEmailSender(): IFunction? =
      unwrap(this).getCustomEmailSender()?.let(IFunction::wrap)

  /**
   * A custom Message AWS Lambda trigger.
   *
   * Default: - no trigger configured
   *
   * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-custom-message.html)
   */
  public fun customMessage(): IFunction? = unwrap(this).getCustomMessage()?.let(IFunction::wrap)

  /**
   * Amazon Cognito invokes this trigger to send SMS notifications to users.
   *
   * Default: - no trigger configured
   *
   * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-custom-sms-sender.html)
   */
  public fun customSmsSender(): IFunction? = unwrap(this).getCustomSmsSender()?.let(IFunction::wrap)

  /**
   * Defines the authentication challenge.
   *
   * Default: - no trigger configured
   *
   * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-define-auth-challenge.html)
   */
  public fun defineAuthChallenge(): IFunction? =
      unwrap(this).getDefineAuthChallenge()?.let(IFunction::wrap)

  /**
   * A post-authentication AWS Lambda trigger.
   *
   * Default: - no trigger configured
   *
   * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-post-authentication.html)
   */
  public fun postAuthentication(): IFunction? =
      unwrap(this).getPostAuthentication()?.let(IFunction::wrap)

  /**
   * A post-confirmation AWS Lambda trigger.
   *
   * Default: - no trigger configured
   *
   * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-post-confirmation.html)
   */
  public fun postConfirmation(): IFunction? =
      unwrap(this).getPostConfirmation()?.let(IFunction::wrap)

  /**
   * A pre-authentication AWS Lambda trigger.
   *
   * Default: - no trigger configured
   *
   * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-pre-authentication.html)
   */
  public fun preAuthentication(): IFunction? =
      unwrap(this).getPreAuthentication()?.let(IFunction::wrap)

  /**
   * A pre-registration AWS Lambda trigger.
   *
   * Default: - no trigger configured
   *
   * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-pre-sign-up.html)
   */
  public fun preSignUp(): IFunction? = unwrap(this).getPreSignUp()?.let(IFunction::wrap)

  /**
   * A pre-token-generation AWS Lambda trigger.
   *
   * Default: - no trigger configured
   *
   * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-pre-token-generation.html)
   */
  public fun preTokenGeneration(): IFunction? =
      unwrap(this).getPreTokenGeneration()?.let(IFunction::wrap)

  /**
   * A user-migration AWS Lambda trigger.
   *
   * Default: - no trigger configured
   *
   * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-migrate-user.html)
   */
  public fun userMigration(): IFunction? = unwrap(this).getUserMigration()?.let(IFunction::wrap)

  /**
   * Verifies the authentication challenge response.
   *
   * Default: - no trigger configured
   *
   * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-verify-auth-challenge-response.html)
   */
  public fun verifyAuthChallengeResponse(): IFunction? =
      unwrap(this).getVerifyAuthChallengeResponse()?.let(IFunction::wrap)

  /**
   * A builder for [UserPoolTriggers]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param createAuthChallenge Creates an authentication challenge.
     */
    public fun createAuthChallenge(createAuthChallenge: IFunction)

    /**
     * @param customEmailSender Amazon Cognito invokes this trigger to send email notifications to
     * users.
     */
    public fun customEmailSender(customEmailSender: IFunction)

    /**
     * @param customMessage A custom Message AWS Lambda trigger.
     */
    public fun customMessage(customMessage: IFunction)

    /**
     * @param customSmsSender Amazon Cognito invokes this trigger to send SMS notifications to
     * users.
     */
    public fun customSmsSender(customSmsSender: IFunction)

    /**
     * @param defineAuthChallenge Defines the authentication challenge.
     */
    public fun defineAuthChallenge(defineAuthChallenge: IFunction)

    /**
     * @param postAuthentication A post-authentication AWS Lambda trigger.
     */
    public fun postAuthentication(postAuthentication: IFunction)

    /**
     * @param postConfirmation A post-confirmation AWS Lambda trigger.
     */
    public fun postConfirmation(postConfirmation: IFunction)

    /**
     * @param preAuthentication A pre-authentication AWS Lambda trigger.
     */
    public fun preAuthentication(preAuthentication: IFunction)

    /**
     * @param preSignUp A pre-registration AWS Lambda trigger.
     */
    public fun preSignUp(preSignUp: IFunction)

    /**
     * @param preTokenGeneration A pre-token-generation AWS Lambda trigger.
     */
    public fun preTokenGeneration(preTokenGeneration: IFunction)

    /**
     * @param userMigration A user-migration AWS Lambda trigger.
     */
    public fun userMigration(userMigration: IFunction)

    /**
     * @param verifyAuthChallengeResponse Verifies the authentication challenge response.
     */
    public fun verifyAuthChallengeResponse(verifyAuthChallengeResponse: IFunction)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.UserPoolTriggers.Builder =
        software.amazon.awscdk.services.cognito.UserPoolTriggers.builder()

    /**
     * @param createAuthChallenge Creates an authentication challenge.
     */
    override fun createAuthChallenge(createAuthChallenge: IFunction) {
      cdkBuilder.createAuthChallenge(createAuthChallenge.let(IFunction::unwrap))
    }

    /**
     * @param customEmailSender Amazon Cognito invokes this trigger to send email notifications to
     * users.
     */
    override fun customEmailSender(customEmailSender: IFunction) {
      cdkBuilder.customEmailSender(customEmailSender.let(IFunction::unwrap))
    }

    /**
     * @param customMessage A custom Message AWS Lambda trigger.
     */
    override fun customMessage(customMessage: IFunction) {
      cdkBuilder.customMessage(customMessage.let(IFunction::unwrap))
    }

    /**
     * @param customSmsSender Amazon Cognito invokes this trigger to send SMS notifications to
     * users.
     */
    override fun customSmsSender(customSmsSender: IFunction) {
      cdkBuilder.customSmsSender(customSmsSender.let(IFunction::unwrap))
    }

    /**
     * @param defineAuthChallenge Defines the authentication challenge.
     */
    override fun defineAuthChallenge(defineAuthChallenge: IFunction) {
      cdkBuilder.defineAuthChallenge(defineAuthChallenge.let(IFunction::unwrap))
    }

    /**
     * @param postAuthentication A post-authentication AWS Lambda trigger.
     */
    override fun postAuthentication(postAuthentication: IFunction) {
      cdkBuilder.postAuthentication(postAuthentication.let(IFunction::unwrap))
    }

    /**
     * @param postConfirmation A post-confirmation AWS Lambda trigger.
     */
    override fun postConfirmation(postConfirmation: IFunction) {
      cdkBuilder.postConfirmation(postConfirmation.let(IFunction::unwrap))
    }

    /**
     * @param preAuthentication A pre-authentication AWS Lambda trigger.
     */
    override fun preAuthentication(preAuthentication: IFunction) {
      cdkBuilder.preAuthentication(preAuthentication.let(IFunction::unwrap))
    }

    /**
     * @param preSignUp A pre-registration AWS Lambda trigger.
     */
    override fun preSignUp(preSignUp: IFunction) {
      cdkBuilder.preSignUp(preSignUp.let(IFunction::unwrap))
    }

    /**
     * @param preTokenGeneration A pre-token-generation AWS Lambda trigger.
     */
    override fun preTokenGeneration(preTokenGeneration: IFunction) {
      cdkBuilder.preTokenGeneration(preTokenGeneration.let(IFunction::unwrap))
    }

    /**
     * @param userMigration A user-migration AWS Lambda trigger.
     */
    override fun userMigration(userMigration: IFunction) {
      cdkBuilder.userMigration(userMigration.let(IFunction::unwrap))
    }

    /**
     * @param verifyAuthChallengeResponse Verifies the authentication challenge response.
     */
    override fun verifyAuthChallengeResponse(verifyAuthChallengeResponse: IFunction) {
      cdkBuilder.verifyAuthChallengeResponse(verifyAuthChallengeResponse.let(IFunction::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cognito.UserPoolTriggers =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cognito.UserPoolTriggers,
  ) : CdkObject(cdkObject), UserPoolTriggers {
    /**
     * Creates an authentication challenge.
     *
     * Default: - no trigger configured
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-create-auth-challenge.html)
     */
    override fun createAuthChallenge(): IFunction? =
        unwrap(this).getCreateAuthChallenge()?.let(IFunction::wrap)

    /**
     * Amazon Cognito invokes this trigger to send email notifications to users.
     *
     * Default: - no trigger configured
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-custom-email-sender.html)
     */
    override fun customEmailSender(): IFunction? =
        unwrap(this).getCustomEmailSender()?.let(IFunction::wrap)

    /**
     * A custom Message AWS Lambda trigger.
     *
     * Default: - no trigger configured
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-custom-message.html)
     */
    override fun customMessage(): IFunction? = unwrap(this).getCustomMessage()?.let(IFunction::wrap)

    /**
     * Amazon Cognito invokes this trigger to send SMS notifications to users.
     *
     * Default: - no trigger configured
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-custom-sms-sender.html)
     */
    override fun customSmsSender(): IFunction? =
        unwrap(this).getCustomSmsSender()?.let(IFunction::wrap)

    /**
     * Defines the authentication challenge.
     *
     * Default: - no trigger configured
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-define-auth-challenge.html)
     */
    override fun defineAuthChallenge(): IFunction? =
        unwrap(this).getDefineAuthChallenge()?.let(IFunction::wrap)

    /**
     * A post-authentication AWS Lambda trigger.
     *
     * Default: - no trigger configured
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-post-authentication.html)
     */
    override fun postAuthentication(): IFunction? =
        unwrap(this).getPostAuthentication()?.let(IFunction::wrap)

    /**
     * A post-confirmation AWS Lambda trigger.
     *
     * Default: - no trigger configured
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-post-confirmation.html)
     */
    override fun postConfirmation(): IFunction? =
        unwrap(this).getPostConfirmation()?.let(IFunction::wrap)

    /**
     * A pre-authentication AWS Lambda trigger.
     *
     * Default: - no trigger configured
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-pre-authentication.html)
     */
    override fun preAuthentication(): IFunction? =
        unwrap(this).getPreAuthentication()?.let(IFunction::wrap)

    /**
     * A pre-registration AWS Lambda trigger.
     *
     * Default: - no trigger configured
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-pre-sign-up.html)
     */
    override fun preSignUp(): IFunction? = unwrap(this).getPreSignUp()?.let(IFunction::wrap)

    /**
     * A pre-token-generation AWS Lambda trigger.
     *
     * Default: - no trigger configured
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-pre-token-generation.html)
     */
    override fun preTokenGeneration(): IFunction? =
        unwrap(this).getPreTokenGeneration()?.let(IFunction::wrap)

    /**
     * A user-migration AWS Lambda trigger.
     *
     * Default: - no trigger configured
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-migrate-user.html)
     */
    override fun userMigration(): IFunction? = unwrap(this).getUserMigration()?.let(IFunction::wrap)

    /**
     * Verifies the authentication challenge response.
     *
     * Default: - no trigger configured
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-lambda-verify-auth-challenge-response.html)
     */
    override fun verifyAuthChallengeResponse(): IFunction? =
        unwrap(this).getVerifyAuthChallengeResponse()?.let(IFunction::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): UserPoolTriggers {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserPoolTriggers):
        UserPoolTriggers = CdkObjectWrappers.wrap(cdkObject) as? UserPoolTriggers ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: UserPoolTriggers):
        software.amazon.awscdk.services.cognito.UserPoolTriggers = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.cognito.UserPoolTriggers
  }
}
