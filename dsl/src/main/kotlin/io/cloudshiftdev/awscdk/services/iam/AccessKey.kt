package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class AccessKey internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iam.AccessKey,
) : Resource(cdkObject), IAccessKey {
  /**
   * The Access Key ID.
   */
  public override fun accessKeyId(): String = unwrap(this).getAccessKeyId()

  /**
   * The Secret Access Key.
   */
  public override fun secretAccessKey(): SecretValue =
      unwrap(this).getSecretAccessKey().let(SecretValue::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iam.AccessKey].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A CloudFormation-specific value that signifies the access key should be replaced/rotated.
     *
     * This value can only be incremented. Incrementing this
     * value will cause CloudFormation to replace the Access Key resource.
     *
     * Default: - No serial value
     *
     * @param serial A CloudFormation-specific value that signifies the access key should be
     * replaced/rotated. 
     */
    public fun serial(serial: Number)

    /**
     * The status of the access key.
     *
     * An Active access key is allowed to be used
     * to make API calls; An Inactive key cannot.
     *
     * Default: - The access key is active
     *
     * @param status The status of the access key. 
     */
    public fun status(status: AccessKeyStatus)

    /**
     * The IAM user this key will belong to.
     *
     * Changing this value will result in the access key being deleted and a new
     * access key (with a different ID and secret value) being assigned to the new
     * user.
     *
     * @param user The IAM user this key will belong to. 
     */
    public fun user(user: IUser)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.AccessKey.Builder =
        software.amazon.awscdk.services.iam.AccessKey.Builder.create(scope, id)

    /**
     * A CloudFormation-specific value that signifies the access key should be replaced/rotated.
     *
     * This value can only be incremented. Incrementing this
     * value will cause CloudFormation to replace the Access Key resource.
     *
     * Default: - No serial value
     *
     * @param serial A CloudFormation-specific value that signifies the access key should be
     * replaced/rotated. 
     */
    override fun serial(serial: Number) {
      cdkBuilder.serial(serial)
    }

    /**
     * The status of the access key.
     *
     * An Active access key is allowed to be used
     * to make API calls; An Inactive key cannot.
     *
     * Default: - The access key is active
     *
     * @param status The status of the access key. 
     */
    override fun status(status: AccessKeyStatus) {
      cdkBuilder.status(status.let(AccessKeyStatus::unwrap))
    }

    /**
     * The IAM user this key will belong to.
     *
     * Changing this value will result in the access key being deleted and a new
     * access key (with a different ID and secret value) being assigned to the new
     * user.
     *
     * @param user The IAM user this key will belong to. 
     */
    override fun user(user: IUser) {
      cdkBuilder.user(user.let(IUser::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.iam.AccessKey = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): AccessKey {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return AccessKey(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.AccessKey): AccessKey =
        AccessKey(cdkObject)

    internal fun unwrap(wrapped: AccessKey): software.amazon.awscdk.services.iam.AccessKey =
        wrapped.cdkObject
  }
}
