package io.cloudshiftdev.awscdk.services.cleanrooms

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnConfiguredTableAssociation internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociation,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  /**
   * Returns the Amazon Resource Name (ARN) of the specified configured table association.
   *
   * Example:
   * `arn:aws:cleanrooms:us-east-1:111122223333:configuredtable/a1b2c3d4-5678-90ab-cdef-EXAMPLE33333`
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Returns the unique identifier of the specified configured table association.
   *
   * Example: `a1b2c3d4-5678-90ab-cdef-EXAMPLE33333`
   */
  public open fun attrConfiguredTableAssociationIdentifier(): String =
      unwrap(this).getAttrConfiguredTableAssociationIdentifier()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * A unique identifier for the configured table to be associated to.
   */
  public open fun configuredTableIdentifier(): String = unwrap(this).getConfiguredTableIdentifier()

  /**
   * A unique identifier for the configured table to be associated to.
   */
  public open fun configuredTableIdentifier(`value`: String) {
    unwrap(this).setConfiguredTableIdentifier(`value`)
  }

  /**
   * A description of the configured table association.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the configured table association.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
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
   * The unique ID for the membership this configured table association belongs to.
   */
  public open fun membershipIdentifier(): String = unwrap(this).getMembershipIdentifier()

  /**
   * The unique ID for the membership this configured table association belongs to.
   */
  public open fun membershipIdentifier(`value`: String) {
    unwrap(this).setMembershipIdentifier(`value`)
  }

  /**
   * The name of the configured table association, in lowercase.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the configured table association, in lowercase.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The service will assume this role to access catalog metadata and query the table.
   */
  public open fun roleArn(): String = unwrap(this).getRoleArn()

  /**
   * The service will assume this role to access catalog metadata and query the table.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * An optional label that you can assign to a resource when you create it.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An optional label that you can assign to a resource when you create it.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * An optional label that you can assign to a resource when you create it.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.cleanrooms.CfnConfiguredTableAssociation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A unique identifier for the configured table to be associated to.
     *
     * Currently accepts a configured table ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-configuredtableidentifier)
     * @param configuredTableIdentifier A unique identifier for the configured table to be
     * associated to. 
     */
    public fun configuredTableIdentifier(configuredTableIdentifier: String)

    /**
     * A description of the configured table association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-description)
     * @param description A description of the configured table association. 
     */
    public fun description(description: String)

    /**
     * The unique ID for the membership this configured table association belongs to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-membershipidentifier)
     * @param membershipIdentifier The unique ID for the membership this configured table
     * association belongs to. 
     */
    public fun membershipIdentifier(membershipIdentifier: String)

    /**
     * The name of the configured table association, in lowercase.
     *
     * The table is identified by this name when running protected queries against the underlying
     * data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-name)
     * @param name The name of the configured table association, in lowercase. 
     */
    public fun name(name: String)

    /**
     * The service will assume this role to access catalog metadata and query the table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-rolearn)
     * @param roleArn The service will assume this role to access catalog metadata and query the
     * table. 
     */
    public fun roleArn(roleArn: String)

    /**
     * An optional label that you can assign to a resource when you create it.
     *
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-tags)
     * @param tags An optional label that you can assign to a resource when you create it. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An optional label that you can assign to a resource when you create it.
     *
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-tags)
     * @param tags An optional label that you can assign to a resource when you create it. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociation.Builder =
        software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociation.Builder.create(scope,
        id)

    /**
     * A unique identifier for the configured table to be associated to.
     *
     * Currently accepts a configured table ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-configuredtableidentifier)
     * @param configuredTableIdentifier A unique identifier for the configured table to be
     * associated to. 
     */
    override fun configuredTableIdentifier(configuredTableIdentifier: String) {
      cdkBuilder.configuredTableIdentifier(configuredTableIdentifier)
    }

    /**
     * A description of the configured table association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-description)
     * @param description A description of the configured table association. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The unique ID for the membership this configured table association belongs to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-membershipidentifier)
     * @param membershipIdentifier The unique ID for the membership this configured table
     * association belongs to. 
     */
    override fun membershipIdentifier(membershipIdentifier: String) {
      cdkBuilder.membershipIdentifier(membershipIdentifier)
    }

    /**
     * The name of the configured table association, in lowercase.
     *
     * The table is identified by this name when running protected queries against the underlying
     * data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-name)
     * @param name The name of the configured table association, in lowercase. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The service will assume this role to access catalog metadata and query the table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-rolearn)
     * @param roleArn The service will assume this role to access catalog metadata and query the
     * table. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * An optional label that you can assign to a resource when you create it.
     *
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-tags)
     * @param tags An optional label that you can assign to a resource when you create it. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An optional label that you can assign to a resource when you create it.
     *
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-tags)
     * @param tags An optional label that you can assign to a resource when you create it. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociation =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConfiguredTableAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConfiguredTableAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociation):
        CfnConfiguredTableAssociation = CfnConfiguredTableAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnConfiguredTableAssociation):
        software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociation = wrapped.cdkObject
  }
}
