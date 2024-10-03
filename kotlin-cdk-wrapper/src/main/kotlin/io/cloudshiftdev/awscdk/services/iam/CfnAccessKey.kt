@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a new AWS secret access key and corresponding AWS access key ID for the specified user.
 *
 * The default status for new keys is `Active` .
 *
 * For information about quotas on the number of keys you can create, see [IAM and AWS STS
 * quotas](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html) in the *IAM User
 * Guide* .
 *
 *
 * To ensure the security of your AWS account , the secret access key is accessible only during key
 * and user creation. You must save the key (for example, in a text file) if you want to be able to
 * access it again. If a secret key is lost, you can rotate access keys by increasing the value of the
 * `serial` property.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * CfnAccessKey cfnAccessKey = CfnAccessKey.Builder.create(this, "MyCfnAccessKey")
 * .userName("userName")
 * // the properties below are optional
 * .serial(123)
 * .status("status")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-accesskey.html)
 */
public open class CfnAccessKey(
  cdkObject: software.amazon.awscdk.services.iam.CfnAccessKey,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAccessKeyProps,
  ) :
      this(software.amazon.awscdk.services.iam.CfnAccessKey(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnAccessKeyProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAccessKeyProps.Builder.() -> Unit,
  ) : this(scope, id, CfnAccessKeyProps(props)
  )

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Returns the secret access key for the specified AWS::IAM::AccessKey resource.
   *
   * For example: wJalrXUtnFEMI/K7MDENG/bPxRfiCYzEXAMPLEKEY.
   */
  public open fun attrSecretAccessKey(): String = unwrap(this).getAttrSecretAccessKey()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * This value is specific to CloudFormation and can only be *incremented* .
   */
  public open fun serial(): Number? = unwrap(this).getSerial()

  /**
   * This value is specific to CloudFormation and can only be *incremented* .
   */
  public open fun serial(`value`: Number) {
    unwrap(this).setSerial(`value`)
  }

  /**
   * The status of the access key.
   */
  public open fun status(): String? = unwrap(this).getStatus()

  /**
   * The status of the access key.
   */
  public open fun status(`value`: String) {
    unwrap(this).setStatus(`value`)
  }

  /**
   * The name of the IAM user that the new key will belong to.
   */
  public open fun userName(): String = unwrap(this).getUserName()

  /**
   * The name of the IAM user that the new key will belong to.
   */
  public open fun userName(`value`: String) {
    unwrap(this).setUserName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iam.CfnAccessKey].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * This value is specific to CloudFormation and can only be *incremented* .
     *
     * Incrementing this value notifies CloudFormation that you want to rotate your access key. When
     * you update your stack, CloudFormation will replace the existing access key with a new key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-accesskey.html#cfn-iam-accesskey-serial)
     * @param serial This value is specific to CloudFormation and can only be *incremented* . 
     */
    public fun serial(serial: Number)

    /**
     * The status of the access key.
     *
     * `Active` means that the key is valid for API calls, while `Inactive` means it is not.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-accesskey.html#cfn-iam-accesskey-status)
     * @param status The status of the access key. 
     */
    public fun status(status: String)

    /**
     * The name of the IAM user that the new key will belong to.
     *
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-accesskey.html#cfn-iam-accesskey-username)
     * @param userName The name of the IAM user that the new key will belong to. 
     */
    public fun userName(userName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.CfnAccessKey.Builder =
        software.amazon.awscdk.services.iam.CfnAccessKey.Builder.create(scope, id)

    /**
     * This value is specific to CloudFormation and can only be *incremented* .
     *
     * Incrementing this value notifies CloudFormation that you want to rotate your access key. When
     * you update your stack, CloudFormation will replace the existing access key with a new key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-accesskey.html#cfn-iam-accesskey-serial)
     * @param serial This value is specific to CloudFormation and can only be *incremented* . 
     */
    override fun serial(serial: Number) {
      cdkBuilder.serial(serial)
    }

    /**
     * The status of the access key.
     *
     * `Active` means that the key is valid for API calls, while `Inactive` means it is not.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-accesskey.html#cfn-iam-accesskey-status)
     * @param status The status of the access key. 
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    /**
     * The name of the IAM user that the new key will belong to.
     *
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-accesskey.html#cfn-iam-accesskey-username)
     * @param userName The name of the IAM user that the new key will belong to. 
     */
    override fun userName(userName: String) {
      cdkBuilder.userName(userName)
    }

    public fun build(): software.amazon.awscdk.services.iam.CfnAccessKey = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iam.CfnAccessKey.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAccessKey {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAccessKey(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnAccessKey): CfnAccessKey =
        CfnAccessKey(cdkObject)

    internal fun unwrap(wrapped: CfnAccessKey): software.amazon.awscdk.services.iam.CfnAccessKey =
        wrapped.cdkObject as software.amazon.awscdk.services.iam.CfnAccessKey
  }
}
