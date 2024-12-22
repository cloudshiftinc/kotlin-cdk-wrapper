@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.identitystore

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A group object, which contains a specified group’s metadata and attributes.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.identitystore.*;
 * CfnGroup cfnGroup = CfnGroup.Builder.create(this, "MyCfnGroup")
 * .displayName("displayName")
 * .identityStoreId("identityStoreId")
 * // the properties below are optional
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-identitystore-group.html)
 */
public open class CfnGroup(
  cdkObject: software.amazon.awscdk.services.identitystore.CfnGroup,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnGroupProps,
  ) :
      this(software.amazon.awscdk.services.identitystore.CfnGroup(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnGroupProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnGroupProps.Builder.() -> Unit,
  ) : this(scope, id, CfnGroupProps(props)
  )

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
   * The display name value for the group.
   */
  public open fun displayName(): String = unwrap(this).getDisplayName()

  /**
   * The display name value for the group.
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
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
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
     * The display name value for the group.
     *
     * The length limit is 1,024 characters. This value can consist of letters, accented characters,
     * symbols, numbers, punctuation, tab, new line, carriage return, space, and nonbreaking space in
     * this attribute. This value is specified at the time the group is created and stored as an
     * attribute of the group object in the identity store.
     *
     * Prefix search supports a maximum of 1,000 characters for the string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-identitystore-group.html#cfn-identitystore-group-displayname)
     * @param displayName The display name value for the group. 
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
     * The display name value for the group.
     *
     * The length limit is 1,024 characters. This value can consist of letters, accented characters,
     * symbols, numbers, punctuation, tab, new line, carriage return, space, and nonbreaking space in
     * this attribute. This value is specified at the time the group is created and stored as an
     * attribute of the group object in the identity store.
     *
     * Prefix search supports a maximum of 1,000 characters for the string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-identitystore-group.html#cfn-identitystore-group-displayname)
     * @param displayName The display name value for the group. 
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
        wrapped.cdkObject as software.amazon.awscdk.services.identitystore.CfnGroup
  }
}
