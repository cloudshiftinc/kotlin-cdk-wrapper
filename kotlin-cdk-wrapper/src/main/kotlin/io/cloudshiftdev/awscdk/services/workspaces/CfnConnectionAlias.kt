@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.workspaces

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::WorkSpaces::ConnectionAlias` resource specifies a connection alias.
 *
 * Connection aliases are used for cross-Region redirection. For more information, see [Cross-Region
 * Redirection for Amazon
 * WorkSpaces](https://docs.aws.amazon.com/workspaces/latest/adminguide/cross-region-redirection.html)
 * .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.workspaces.*;
 * CfnConnectionAlias cfnConnectionAlias = CfnConnectionAlias.Builder.create(this,
 * "MyCfnConnectionAlias")
 * .connectionString("connectionString")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-connectionalias.html)
 */
public open class CfnConnectionAlias(
  cdkObject: software.amazon.awscdk.services.workspaces.CfnConnectionAlias,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnConnectionAliasProps,
  ) :
      this(software.amazon.awscdk.services.workspaces.CfnConnectionAlias(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnConnectionAliasProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnConnectionAliasProps.Builder.() -> Unit,
  ) : this(scope, id, CfnConnectionAliasProps(props)
  )

  /**
   * The identifier of the connection alias, returned as a string.
   */
  public open fun attrAliasId(): String = unwrap(this).getAttrAliasId()

  /**
   * The association status of the connection alias.
   */
  public open fun attrAssociations(): IResolvable =
      unwrap(this).getAttrAssociations().let(IResolvable::wrap)

  /**
   * The current state of the connection alias, returned as a string.
   */
  public open fun attrConnectionAliasState(): String = unwrap(this).getAttrConnectionAliasState()

  /**
   * The connection string specified for the connection alias.
   */
  public open fun connectionString(): String = unwrap(this).getConnectionString()

  /**
   * The connection string specified for the connection alias.
   */
  public open fun connectionString(`value`: String) {
    unwrap(this).setConnectionString(`value`)
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
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags to associate with the connection alias.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags to associate with the connection alias.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags to associate with the connection alias.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.workspaces.CfnConnectionAlias].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The connection string specified for the connection alias.
     *
     * The connection string must be in the form of a fully qualified domain name (FQDN), such as
     * `www.example.com` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-connectionalias.html#cfn-workspaces-connectionalias-connectionstring)
     * @param connectionString The connection string specified for the connection alias. 
     */
    public fun connectionString(connectionString: String)

    /**
     * The tags to associate with the connection alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-connectionalias.html#cfn-workspaces-connectionalias-tags)
     * @param tags The tags to associate with the connection alias. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags to associate with the connection alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-connectionalias.html#cfn-workspaces-connectionalias-tags)
     * @param tags The tags to associate with the connection alias. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.workspaces.CfnConnectionAlias.Builder =
        software.amazon.awscdk.services.workspaces.CfnConnectionAlias.Builder.create(scope, id)

    /**
     * The connection string specified for the connection alias.
     *
     * The connection string must be in the form of a fully qualified domain name (FQDN), such as
     * `www.example.com` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-connectionalias.html#cfn-workspaces-connectionalias-connectionstring)
     * @param connectionString The connection string specified for the connection alias. 
     */
    override fun connectionString(connectionString: String) {
      cdkBuilder.connectionString(connectionString)
    }

    /**
     * The tags to associate with the connection alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-connectionalias.html#cfn-workspaces-connectionalias-tags)
     * @param tags The tags to associate with the connection alias. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags to associate with the connection alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-connectionalias.html#cfn-workspaces-connectionalias-tags)
     * @param tags The tags to associate with the connection alias. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.workspaces.CfnConnectionAlias =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.workspaces.CfnConnectionAlias.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConnectionAlias {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConnectionAlias(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.workspaces.CfnConnectionAlias):
        CfnConnectionAlias = CfnConnectionAlias(cdkObject)

    internal fun unwrap(wrapped: CfnConnectionAlias):
        software.amazon.awscdk.services.workspaces.CfnConnectionAlias = wrapped.cdkObject as
        software.amazon.awscdk.services.workspaces.CfnConnectionAlias
  }

  /**
   * Describes a connection alias association that is used for cross-Region redirection.
   *
   * For more information, see [Cross-Region Redirection for Amazon
   * WorkSpaces](https://docs.aws.amazon.com/workspaces/latest/adminguide/cross-region-redirection.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.workspaces.*;
   * ConnectionAliasAssociationProperty connectionAliasAssociationProperty =
   * ConnectionAliasAssociationProperty.builder()
   * .associatedAccountId("associatedAccountId")
   * .associationStatus("associationStatus")
   * .connectionIdentifier("connectionIdentifier")
   * .resourceId("resourceId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-connectionalias-connectionaliasassociation.html)
   */
  public interface ConnectionAliasAssociationProperty {
    /**
     * The identifier of the AWS account that associated the connection alias with a directory.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-connectionalias-connectionaliasassociation.html#cfn-workspaces-connectionalias-connectionaliasassociation-associatedaccountid)
     */
    public fun associatedAccountId(): String? = unwrap(this).getAssociatedAccountId()

    /**
     * The association status of the connection alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-connectionalias-connectionaliasassociation.html#cfn-workspaces-connectionalias-connectionaliasassociation-associationstatus)
     */
    public fun associationStatus(): String? = unwrap(this).getAssociationStatus()

    /**
     * The identifier of the connection alias association.
     *
     * You use the connection identifier in the DNS TXT record when you're configuring your DNS
     * routing policies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-connectionalias-connectionaliasassociation.html#cfn-workspaces-connectionalias-connectionaliasassociation-connectionidentifier)
     */
    public fun connectionIdentifier(): String? = unwrap(this).getConnectionIdentifier()

    /**
     * The identifier of the directory associated with a connection alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-connectionalias-connectionaliasassociation.html#cfn-workspaces-connectionalias-connectionaliasassociation-resourceid)
     */
    public fun resourceId(): String? = unwrap(this).getResourceId()

    /**
     * A builder for [ConnectionAliasAssociationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param associatedAccountId The identifier of the AWS account that associated the connection
       * alias with a directory.
       */
      public fun associatedAccountId(associatedAccountId: String)

      /**
       * @param associationStatus The association status of the connection alias.
       */
      public fun associationStatus(associationStatus: String)

      /**
       * @param connectionIdentifier The identifier of the connection alias association.
       * You use the connection identifier in the DNS TXT record when you're configuring your DNS
       * routing policies.
       */
      public fun connectionIdentifier(connectionIdentifier: String)

      /**
       * @param resourceId The identifier of the directory associated with a connection alias.
       */
      public fun resourceId(resourceId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.workspaces.CfnConnectionAlias.ConnectionAliasAssociationProperty.Builder
          =
          software.amazon.awscdk.services.workspaces.CfnConnectionAlias.ConnectionAliasAssociationProperty.builder()

      /**
       * @param associatedAccountId The identifier of the AWS account that associated the connection
       * alias with a directory.
       */
      override fun associatedAccountId(associatedAccountId: String) {
        cdkBuilder.associatedAccountId(associatedAccountId)
      }

      /**
       * @param associationStatus The association status of the connection alias.
       */
      override fun associationStatus(associationStatus: String) {
        cdkBuilder.associationStatus(associationStatus)
      }

      /**
       * @param connectionIdentifier The identifier of the connection alias association.
       * You use the connection identifier in the DNS TXT record when you're configuring your DNS
       * routing policies.
       */
      override fun connectionIdentifier(connectionIdentifier: String) {
        cdkBuilder.connectionIdentifier(connectionIdentifier)
      }

      /**
       * @param resourceId The identifier of the directory associated with a connection alias.
       */
      override fun resourceId(resourceId: String) {
        cdkBuilder.resourceId(resourceId)
      }

      public fun build():
          software.amazon.awscdk.services.workspaces.CfnConnectionAlias.ConnectionAliasAssociationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.workspaces.CfnConnectionAlias.ConnectionAliasAssociationProperty,
    ) : CdkObject(cdkObject), ConnectionAliasAssociationProperty {
      /**
       * The identifier of the AWS account that associated the connection alias with a directory.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-connectionalias-connectionaliasassociation.html#cfn-workspaces-connectionalias-connectionaliasassociation-associatedaccountid)
       */
      override fun associatedAccountId(): String? = unwrap(this).getAssociatedAccountId()

      /**
       * The association status of the connection alias.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-connectionalias-connectionaliasassociation.html#cfn-workspaces-connectionalias-connectionaliasassociation-associationstatus)
       */
      override fun associationStatus(): String? = unwrap(this).getAssociationStatus()

      /**
       * The identifier of the connection alias association.
       *
       * You use the connection identifier in the DNS TXT record when you're configuring your DNS
       * routing policies.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-connectionalias-connectionaliasassociation.html#cfn-workspaces-connectionalias-connectionaliasassociation-connectionidentifier)
       */
      override fun connectionIdentifier(): String? = unwrap(this).getConnectionIdentifier()

      /**
       * The identifier of the directory associated with a connection alias.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspaces-connectionalias-connectionaliasassociation.html#cfn-workspaces-connectionalias-connectionaliasassociation-resourceid)
       */
      override fun resourceId(): String? = unwrap(this).getResourceId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConnectionAliasAssociationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.workspaces.CfnConnectionAlias.ConnectionAliasAssociationProperty):
          ConnectionAliasAssociationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ConnectionAliasAssociationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectionAliasAssociationProperty):
          software.amazon.awscdk.services.workspaces.CfnConnectionAlias.ConnectionAliasAssociationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.workspaces.CfnConnectionAlias.ConnectionAliasAssociationProperty
    }
  }
}
