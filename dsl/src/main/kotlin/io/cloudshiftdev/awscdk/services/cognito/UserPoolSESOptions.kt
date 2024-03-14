package io.cloudshiftdev.awscdk.services.cognito

import kotlin.String
import kotlin.Unit

public interface UserPoolSESOptions {
  public fun configurationSetName(): String? = unwrap(this).getConfigurationSetName()

  public fun fromEmail(): String

  public fun fromName(): String? = unwrap(this).getFromName()

  public fun replyTo(): String? = unwrap(this).getReplyTo()

  public fun sesRegion(): String? = unwrap(this).getSesRegion()

  public fun sesVerifiedDomain(): String? = unwrap(this).getSesVerifiedDomain()

  public interface Builder {
    public fun configurationSetName(configurationSetName: String) {
    }

    public fun fromEmail(fromEmail: String) {
    }

    public fun fromName(fromName: String) {
    }

    public fun replyTo(replyTo: String) {
    }

    public fun sesRegion(sesRegion: String) {
    }

    public fun sesVerifiedDomain(sesVerifiedDomain: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.UserPoolSESOptions.Builder =
        software.amazon.awscdk.services.cognito.UserPoolSESOptions.builder()

    public override fun configurationSetName(configurationSetName: String) {
      cdkBuilder.configurationSetName(configurationSetName)
    }

    public override fun fromEmail(fromEmail: String) {
      cdkBuilder.fromEmail(fromEmail)
    }

    public override fun fromName(fromName: String) {
      cdkBuilder.fromName(fromName)
    }

    public override fun replyTo(replyTo: String) {
      cdkBuilder.replyTo(replyTo)
    }

    public override fun sesRegion(sesRegion: String) {
      cdkBuilder.sesRegion(sesRegion)
    }

    public override fun sesVerifiedDomain(sesVerifiedDomain: String) {
      cdkBuilder.sesVerifiedDomain(sesVerifiedDomain)
    }

    public fun build(): software.amazon.awscdk.services.cognito.UserPoolSESOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cognito.UserPoolSESOptions,
  ) : UserPoolSESOptions {
    public override fun configurationSetName(): String? = unwrap(this).getConfigurationSetName()

    public override fun fromEmail(): String = unwrap(this).getFromEmail()

    public override fun fromName(): String? = unwrap(this).getFromName()

    public override fun replyTo(): String? = unwrap(this).getReplyTo()

    public override fun sesRegion(): String? = unwrap(this).getSesRegion()

    public override fun sesVerifiedDomain(): String? = unwrap(this).getSesVerifiedDomain()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): UserPoolSESOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserPoolSESOptions):
        UserPoolSESOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: UserPoolSESOptions):
        software.amazon.awscdk.services.cognito.UserPoolSESOptions = (wrapped as Wrapper).cdkObject
  }
}
