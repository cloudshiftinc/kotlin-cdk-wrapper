package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSecurityKey internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.connect.CfnSecurityKey,
) : CfnResource(cdkObject), IInspectable {
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
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
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
        software.amazon.awscdk.services.connect.CfnSecurityKey = wrapped.cdkObject
  }
}