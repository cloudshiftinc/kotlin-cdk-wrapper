@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Define a new IAM Access Key.
 *
 * Example:
 *
 * ```
 * // Creates a new IAM user, access and secret keys, and stores the secret access key in a Secret.
 * User user = new User(this, "User");
 * AccessKey accessKey = AccessKey.Builder.create(this, "AccessKey").user(user).build();
 * Secret secret = Secret.Builder.create(this, "Secret")
 * .secretStringValue(accessKey.getSecretAccessKey())
 * .build();
 * ```
 */
public open class AccessKey(
  cdkObject: software.amazon.awscdk.services.iam.AccessKey,
) : Resource(cdkObject),
    IAccessKey {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: AccessKeyProps,
  ) :
      this(software.amazon.awscdk.services.iam.AccessKey(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(AccessKeyProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: AccessKeyProps.Builder.() -> Unit,
  ) : this(scope, id, AccessKeyProps(props)
  )

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
      cdkBuilder.status(status.let(AccessKeyStatus.Companion::unwrap))
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
      cdkBuilder.user(user.let(IUser.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.iam.AccessKey = cdkBuilder.build()
  }

  public companion object {
    public val PROPERTY_INJECTION_ID: String =
        software.amazon.awscdk.services.iam.AccessKey.PROPERTY_INJECTION_ID

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
        wrapped.cdkObject as software.amazon.awscdk.services.iam.AccessKey
  }
}
