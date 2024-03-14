package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.services.lambda.IFunction
import kotlin.Unit

public interface UserPoolTriggers {
  public fun createAuthChallenge(): IFunction? =
      unwrap(this).getCreateAuthChallenge()?.let(IFunction::wrap)

  public fun customEmailSender(): IFunction? =
      unwrap(this).getCustomEmailSender()?.let(IFunction::wrap)

  public fun customMessage(): IFunction? = unwrap(this).getCustomMessage()?.let(IFunction::wrap)

  public fun customSmsSender(): IFunction? = unwrap(this).getCustomSmsSender()?.let(IFunction::wrap)

  public fun defineAuthChallenge(): IFunction? =
      unwrap(this).getDefineAuthChallenge()?.let(IFunction::wrap)

  public fun postAuthentication(): IFunction? =
      unwrap(this).getPostAuthentication()?.let(IFunction::wrap)

  public fun postConfirmation(): IFunction? =
      unwrap(this).getPostConfirmation()?.let(IFunction::wrap)

  public fun preAuthentication(): IFunction? =
      unwrap(this).getPreAuthentication()?.let(IFunction::wrap)

  public fun preSignUp(): IFunction? = unwrap(this).getPreSignUp()?.let(IFunction::wrap)

  public fun preTokenGeneration(): IFunction? =
      unwrap(this).getPreTokenGeneration()?.let(IFunction::wrap)

  public fun userMigration(): IFunction? = unwrap(this).getUserMigration()?.let(IFunction::wrap)

  public fun verifyAuthChallengeResponse(): IFunction? =
      unwrap(this).getVerifyAuthChallengeResponse()?.let(IFunction::wrap)

  public interface Builder {
    public fun createAuthChallenge(createAuthChallenge: IFunction) {
    }

    public fun customEmailSender(customEmailSender: IFunction) {
    }

    public fun customMessage(customMessage: IFunction) {
    }

    public fun customSmsSender(customSmsSender: IFunction) {
    }

    public fun defineAuthChallenge(defineAuthChallenge: IFunction) {
    }

    public fun postAuthentication(postAuthentication: IFunction) {
    }

    public fun postConfirmation(postConfirmation: IFunction) {
    }

    public fun preAuthentication(preAuthentication: IFunction) {
    }

    public fun preSignUp(preSignUp: IFunction) {
    }

    public fun preTokenGeneration(preTokenGeneration: IFunction) {
    }

    public fun userMigration(userMigration: IFunction) {
    }

    public fun verifyAuthChallengeResponse(verifyAuthChallengeResponse: IFunction) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.UserPoolTriggers.Builder =
        software.amazon.awscdk.services.cognito.UserPoolTriggers.builder()

    public override fun createAuthChallenge(createAuthChallenge: IFunction) {
      cdkBuilder.createAuthChallenge(createAuthChallenge.let(IFunction::unwrap))
    }

    public override fun customEmailSender(customEmailSender: IFunction) {
      cdkBuilder.customEmailSender(customEmailSender.let(IFunction::unwrap))
    }

    public override fun customMessage(customMessage: IFunction) {
      cdkBuilder.customMessage(customMessage.let(IFunction::unwrap))
    }

    public override fun customSmsSender(customSmsSender: IFunction) {
      cdkBuilder.customSmsSender(customSmsSender.let(IFunction::unwrap))
    }

    public override fun defineAuthChallenge(defineAuthChallenge: IFunction) {
      cdkBuilder.defineAuthChallenge(defineAuthChallenge.let(IFunction::unwrap))
    }

    public override fun postAuthentication(postAuthentication: IFunction) {
      cdkBuilder.postAuthentication(postAuthentication.let(IFunction::unwrap))
    }

    public override fun postConfirmation(postConfirmation: IFunction) {
      cdkBuilder.postConfirmation(postConfirmation.let(IFunction::unwrap))
    }

    public override fun preAuthentication(preAuthentication: IFunction) {
      cdkBuilder.preAuthentication(preAuthentication.let(IFunction::unwrap))
    }

    public override fun preSignUp(preSignUp: IFunction) {
      cdkBuilder.preSignUp(preSignUp.let(IFunction::unwrap))
    }

    public override fun preTokenGeneration(preTokenGeneration: IFunction) {
      cdkBuilder.preTokenGeneration(preTokenGeneration.let(IFunction::unwrap))
    }

    public override fun userMigration(userMigration: IFunction) {
      cdkBuilder.userMigration(userMigration.let(IFunction::unwrap))
    }

    public override fun verifyAuthChallengeResponse(verifyAuthChallengeResponse: IFunction) {
      cdkBuilder.verifyAuthChallengeResponse(verifyAuthChallengeResponse.let(IFunction::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cognito.UserPoolTriggers =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cognito.UserPoolTriggers,
  ) : UserPoolTriggers {
    public override fun createAuthChallenge(): IFunction? =
        unwrap(this).getCreateAuthChallenge()?.let(IFunction::wrap)

    public override fun customEmailSender(): IFunction? =
        unwrap(this).getCustomEmailSender()?.let(IFunction::wrap)

    public override fun customMessage(): IFunction? =
        unwrap(this).getCustomMessage()?.let(IFunction::wrap)

    public override fun customSmsSender(): IFunction? =
        unwrap(this).getCustomSmsSender()?.let(IFunction::wrap)

    public override fun defineAuthChallenge(): IFunction? =
        unwrap(this).getDefineAuthChallenge()?.let(IFunction::wrap)

    public override fun postAuthentication(): IFunction? =
        unwrap(this).getPostAuthentication()?.let(IFunction::wrap)

    public override fun postConfirmation(): IFunction? =
        unwrap(this).getPostConfirmation()?.let(IFunction::wrap)

    public override fun preAuthentication(): IFunction? =
        unwrap(this).getPreAuthentication()?.let(IFunction::wrap)

    public override fun preSignUp(): IFunction? = unwrap(this).getPreSignUp()?.let(IFunction::wrap)

    public override fun preTokenGeneration(): IFunction? =
        unwrap(this).getPreTokenGeneration()?.let(IFunction::wrap)

    public override fun userMigration(): IFunction? =
        unwrap(this).getUserMigration()?.let(IFunction::wrap)

    public override fun verifyAuthChallengeResponse(): IFunction? =
        unwrap(this).getVerifyAuthChallengeResponse()?.let(IFunction::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): UserPoolTriggers {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserPoolTriggers):
        UserPoolTriggers = Wrapper(cdkObject)

    internal fun unwrap(wrapped: UserPoolTriggers):
        software.amazon.awscdk.services.cognito.UserPoolTriggers = (wrapped as Wrapper).cdkObject
  }
}
