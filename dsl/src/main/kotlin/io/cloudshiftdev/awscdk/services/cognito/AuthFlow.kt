package io.cloudshiftdev.awscdk.services.cognito

import kotlin.Boolean
import kotlin.Unit

public interface AuthFlow {
  public fun adminUserPassword(): Boolean? = unwrap(this).getAdminUserPassword()

  public fun custom(): Boolean? = unwrap(this).getCustom()

  public fun userPassword(): Boolean? = unwrap(this).getUserPassword()

  public fun userSrp(): Boolean? = unwrap(this).getUserSrp()

  public interface Builder {
    public fun adminUserPassword(adminUserPassword: Boolean)

    public fun custom(custom: Boolean)

    public fun userPassword(userPassword: Boolean)

    public fun userSrp(userSrp: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.AuthFlow.Builder =
        software.amazon.awscdk.services.cognito.AuthFlow.builder()

    override fun adminUserPassword(adminUserPassword: Boolean) {
      cdkBuilder.adminUserPassword(adminUserPassword)
    }

    override fun custom(custom: Boolean) {
      cdkBuilder.custom(custom)
    }

    override fun userPassword(userPassword: Boolean) {
      cdkBuilder.userPassword(userPassword)
    }

    override fun userSrp(userSrp: Boolean) {
      cdkBuilder.userSrp(userSrp)
    }

    public fun build(): software.amazon.awscdk.services.cognito.AuthFlow = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cognito.AuthFlow,
  ) : AuthFlow {
    override fun adminUserPassword(): Boolean? = unwrap(this).getAdminUserPassword()

    override fun custom(): Boolean? = unwrap(this).getCustom()

    override fun userPassword(): Boolean? = unwrap(this).getUserPassword()

    override fun userSrp(): Boolean? = unwrap(this).getUserSrp()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AuthFlow {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.AuthFlow): AuthFlow =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AuthFlow): software.amazon.awscdk.services.cognito.AuthFlow =
        (wrapped as Wrapper).cdkObject
  }
}
