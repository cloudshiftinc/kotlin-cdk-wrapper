package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Unit

public interface AuthFlow {
  /**
   * Enable admin based user password authentication flow.
   *
   * Default: false
   */
  public fun adminUserPassword(): Boolean? = unwrap(this).getAdminUserPassword()

  /**
   * Enable custom authentication flow.
   *
   * Default: false
   */
  public fun custom(): Boolean? = unwrap(this).getCustom()

  /**
   * Enable auth using username &amp; password.
   *
   * Default: false
   */
  public fun userPassword(): Boolean? = unwrap(this).getUserPassword()

  /**
   * Enable SRP based authentication.
   *
   * Default: false
   */
  public fun userSrp(): Boolean? = unwrap(this).getUserSrp()

  /**
   * A builder for [AuthFlow]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param adminUserPassword Enable admin based user password authentication flow.
     */
    public fun adminUserPassword(adminUserPassword: Boolean)

    /**
     * @param custom Enable custom authentication flow.
     */
    public fun custom(custom: Boolean)

    /**
     * @param userPassword Enable auth using username &amp; password.
     */
    public fun userPassword(userPassword: Boolean)

    /**
     * @param userSrp Enable SRP based authentication.
     */
    public fun userSrp(userSrp: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.AuthFlow.Builder =
        software.amazon.awscdk.services.cognito.AuthFlow.builder()

    /**
     * @param adminUserPassword Enable admin based user password authentication flow.
     */
    override fun adminUserPassword(adminUserPassword: Boolean) {
      cdkBuilder.adminUserPassword(adminUserPassword)
    }

    /**
     * @param custom Enable custom authentication flow.
     */
    override fun custom(custom: Boolean) {
      cdkBuilder.custom(custom)
    }

    /**
     * @param userPassword Enable auth using username &amp; password.
     */
    override fun userPassword(userPassword: Boolean) {
      cdkBuilder.userPassword(userPassword)
    }

    /**
     * @param userSrp Enable SRP based authentication.
     */
    override fun userSrp(userSrp: Boolean) {
      cdkBuilder.userSrp(userSrp)
    }

    public fun build(): software.amazon.awscdk.services.cognito.AuthFlow = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cognito.AuthFlow,
  ) : CdkObject(cdkObject), AuthFlow {
    /**
     * Enable admin based user password authentication flow.
     *
     * Default: false
     */
    override fun adminUserPassword(): Boolean? = unwrap(this).getAdminUserPassword()

    /**
     * Enable custom authentication flow.
     *
     * Default: false
     */
    override fun custom(): Boolean? = unwrap(this).getCustom()

    /**
     * Enable auth using username &amp; password.
     *
     * Default: false
     */
    override fun userPassword(): Boolean? = unwrap(this).getUserPassword()

    /**
     * Enable SRP based authentication.
     *
     * Default: false
     */
    override fun userSrp(): Boolean? = unwrap(this).getUserSrp()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AuthFlow {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.AuthFlow): AuthFlow =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AuthFlow): software.amazon.awscdk.services.cognito.AuthFlow =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.cognito.AuthFlow
  }
}
