@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The security key for the instance.
 *
 *
 * Only two security keys are allowed per Amazon Connect instance.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.connect.*;
 * CfnSecurityKey cfnSecurityKey = CfnSecurityKey.Builder.create(this, "MyCfnSecurityKey")
 * .instanceId("instanceId")
 * .key("key")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securitykey.html)
 */
public open class CfnSecurityKey(
  cdkObject: software.amazon.awscdk.services.connect.CfnSecurityKey,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSecurityKeyProps,
  ) :
      this(software.amazon.awscdk.services.connect.CfnSecurityKey(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnSecurityKeyProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSecurityKeyProps.Builder.() -> Unit,
  ) : this(scope, id, CfnSecurityKeyProps(props)
  )

  /**
   * An `AssociationId` is automatically generated when a storage config is associated with an
   * instance.
   */
  public open fun attrAssociationId(): String = unwrap(this).getAttrAssociationId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The Amazon Resource Name (ARN) of the instance.
   */
  public open fun instanceId(): String = unwrap(this).getInstanceId()

  /**
   * The Amazon Resource Name (ARN) of the instance.
   */
  public open fun instanceId(`value`: String) {
    unwrap(this).setInstanceId(`value`)
  }

  /**
   * A valid security key in PEM format.
   *
   * For example:.
   */
  public open fun key(): String = unwrap(this).getKey()

  /**
   * A valid security key in PEM format.
   *
   * For example:.
   */
  public open fun key(`value`: String) {
    unwrap(this).setKey(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.connect.CfnSecurityKey].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Resource Name (ARN) of the instance.
     *
     * *Minimum* : `1`
     *
     * *Maximum* : `100`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securitykey.html#cfn-connect-securitykey-instanceid)
     * @param instanceId The Amazon Resource Name (ARN) of the instance. 
     */
    public fun instanceId(instanceId: String)

    /**
     * A valid security key in PEM format. For example:.
     *
     * `"-----BEGIN PUBLIC KEY-----\ [a lot of characters] ----END PUBLIC KEY-----"`
     *
     * *Minimum* : `1`
     *
     * *Maximum* : `1024`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securitykey.html#cfn-connect-securitykey-key)
     * @param key A valid security key in PEM format. For example:. 
     */
    public fun key(key: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnSecurityKey.Builder =
        software.amazon.awscdk.services.connect.CfnSecurityKey.Builder.create(scope, id)

    /**
     * The Amazon Resource Name (ARN) of the instance.
     *
     * *Minimum* : `1`
     *
     * *Maximum* : `100`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securitykey.html#cfn-connect-securitykey-instanceid)
     * @param instanceId The Amazon Resource Name (ARN) of the instance. 
     */
    override fun instanceId(instanceId: String) {
      cdkBuilder.instanceId(instanceId)
    }

    /**
     * A valid security key in PEM format. For example:.
     *
     * `"-----BEGIN PUBLIC KEY-----\ [a lot of characters] ----END PUBLIC KEY-----"`
     *
     * *Minimum* : `1`
     *
     * *Maximum* : `1024`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securitykey.html#cfn-connect-securitykey-key)
     * @param key A valid security key in PEM format. For example:. 
     */
    override fun key(key: String) {
      cdkBuilder.key(key)
    }

    public fun build(): software.amazon.awscdk.services.connect.CfnSecurityKey = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.connect.CfnSecurityKey.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSecurityKey {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSecurityKey(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnSecurityKey):
        CfnSecurityKey = CfnSecurityKey(cdkObject)

    internal fun unwrap(wrapped: CfnSecurityKey):
        software.amazon.awscdk.services.connect.CfnSecurityKey = wrapped.cdkObject as
        software.amazon.awscdk.services.connect.CfnSecurityKey
  }
}
