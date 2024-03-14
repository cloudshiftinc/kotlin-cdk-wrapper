package io.cloudshiftdev.awscdk.services.identitystore

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnGroup internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.identitystore.CfnGroup,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The identifier of the newly created group in the identity store.
   */
  public open fun attrGroupId(): String = unwrap(this).getAttrGroupId()

  /**
   * A string containing the description of the group.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A string containing the description of the group.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * A string containing the name of the group.
   */
  public open fun displayName(): String = unwrap(this).getDisplayName()

  /**
   * A string containing the name of the group.
   */
  public open fun displayName(`value`: String) {
    unwrap(this).setDisplayName(`value`)
  }

  /**
   * The globally unique identifier for the identity store.
   */
  public open fun identityStoreId(): String = unwrap(this).getIdentityStoreId()

  /**
   * The globally unique identifier for the identity store.
   */
  public open fun identityStoreId(`value`: String) {
    unwrap(this).setIdentityStoreId(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.identitystore.CfnGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A string containing the description of the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-identitystore-group.html#cfn-identitystore-group-description)
     * @param description A string containing the description of the group. 
     */
    public fun description(description: String)

    /**
     * A string containing the name of the group.
     *
     * This value is commonly displayed when the group is referenced.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-identitystore-group.html#cfn-identitystore-group-displayname)
     * @param displayName A string containing the name of the group. 
     */
    public fun displayName(displayName: String)

    /**
     * The globally unique identifier for the identity store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-identitystore-group.html#cfn-identitystore-group-identitystoreid)
     * @param identityStoreId The globally unique identifier for the identity store. 
     */
    public fun identityStoreId(identityStoreId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.identitystore.CfnGroup.Builder =
        software.amazon.awscdk.services.identitystore.CfnGroup.Builder.create(scope, id)

    /**
     * A string containing the description of the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-identitystore-group.html#cfn-identitystore-group-description)
     * @param description A string containing the description of the group. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * A string containing the name of the group.
     *
     * This value is commonly displayed when the group is referenced.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-identitystore-group.html#cfn-identitystore-group-displayname)
     * @param displayName A string containing the name of the group. 
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * The globally unique identifier for the identity store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-identitystore-group.html#cfn-identitystore-group-identitystoreid)
     * @param identityStoreId The globally unique identifier for the identity store. 
     */
    override fun identityStoreId(identityStoreId: String) {
      cdkBuilder.identityStoreId(identityStoreId)
    }

    public fun build(): software.amazon.awscdk.services.identitystore.CfnGroup = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.identitystore.CfnGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.identitystore.CfnGroup): CfnGroup =
        CfnGroup(cdkObject)

    internal fun unwrap(wrapped: CfnGroup): software.amazon.awscdk.services.identitystore.CfnGroup =
        wrapped.cdkObject
  }
}
