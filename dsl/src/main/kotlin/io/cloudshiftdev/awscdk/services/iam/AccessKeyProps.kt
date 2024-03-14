package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit

public interface AccessKeyProps {
  /**
   * A CloudFormation-specific value that signifies the access key should be replaced/rotated.
   *
   * This value can only be incremented. Incrementing this
   * value will cause CloudFormation to replace the Access Key resource.
   *
   * Default: - No serial value
   */
  public fun serial(): Number? = unwrap(this).getSerial()

  /**
   * The status of the access key.
   *
   * An Active access key is allowed to be used
   * to make API calls; An Inactive key cannot.
   *
   * Default: - The access key is active
   */
  public fun status(): AccessKeyStatus? = unwrap(this).getStatus()?.let(AccessKeyStatus::wrap)

  /**
   * The IAM user this key will belong to.
   *
   * Changing this value will result in the access key being deleted and a new
   * access key (with a different ID and secret value) being assigned to the new
   * user.
   */
  public fun user(): IUser

  /**
   * A builder for [AccessKeyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param serial A CloudFormation-specific value that signifies the access key should be
     * replaced/rotated.
     * This value can only be incremented. Incrementing this
     * value will cause CloudFormation to replace the Access Key resource.
     */
    public fun serial(serial: Number)

    /**
     * @param status The status of the access key.
     * An Active access key is allowed to be used
     * to make API calls; An Inactive key cannot.
     */
    public fun status(status: AccessKeyStatus)

    /**
     * @param user The IAM user this key will belong to. 
     * Changing this value will result in the access key being deleted and a new
     * access key (with a different ID and secret value) being assigned to the new
     * user.
     */
    public fun user(user: IUser)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.AccessKeyProps.Builder =
        software.amazon.awscdk.services.iam.AccessKeyProps.builder()

    /**
     * @param serial A CloudFormation-specific value that signifies the access key should be
     * replaced/rotated.
     * This value can only be incremented. Incrementing this
     * value will cause CloudFormation to replace the Access Key resource.
     */
    override fun serial(serial: Number) {
      cdkBuilder.serial(serial)
    }

    /**
     * @param status The status of the access key.
     * An Active access key is allowed to be used
     * to make API calls; An Inactive key cannot.
     */
    override fun status(status: AccessKeyStatus) {
      cdkBuilder.status(status.let(AccessKeyStatus::unwrap))
    }

    /**
     * @param user The IAM user this key will belong to. 
     * Changing this value will result in the access key being deleted and a new
     * access key (with a different ID and secret value) being assigned to the new
     * user.
     */
    override fun user(user: IUser) {
      cdkBuilder.user(user.let(IUser::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.iam.AccessKeyProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.AccessKeyProps,
  ) : CdkObject(cdkObject), AccessKeyProps {
    /**
     * A CloudFormation-specific value that signifies the access key should be replaced/rotated.
     *
     * This value can only be incremented. Incrementing this
     * value will cause CloudFormation to replace the Access Key resource.
     *
     * Default: - No serial value
     */
    override fun serial(): Number? = unwrap(this).getSerial()

    /**
     * The status of the access key.
     *
     * An Active access key is allowed to be used
     * to make API calls; An Inactive key cannot.
     *
     * Default: - The access key is active
     */
    override fun status(): AccessKeyStatus? = unwrap(this).getStatus()?.let(AccessKeyStatus::wrap)

    /**
     * The IAM user this key will belong to.
     *
     * Changing this value will result in the access key being deleted and a new
     * access key (with a different ID and secret value) being assigned to the new
     * user.
     */
    override fun user(): IUser = unwrap(this).getUser().let(IUser::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AccessKeyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.AccessKeyProps): AccessKeyProps
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AccessKeyProps): software.amazon.awscdk.services.iam.AccessKeyProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.iam.AccessKeyProps
  }
}
