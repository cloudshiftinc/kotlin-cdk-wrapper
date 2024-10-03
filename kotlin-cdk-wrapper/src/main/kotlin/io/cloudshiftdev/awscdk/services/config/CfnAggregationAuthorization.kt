@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * An object that represents the authorizations granted to aggregator accounts and regions.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.config.*;
 * CfnAggregationAuthorization cfnAggregationAuthorization =
 * CfnAggregationAuthorization.Builder.create(this, "MyCfnAggregationAuthorization")
 * .authorizedAccountId("authorizedAccountId")
 * .authorizedAwsRegion("authorizedAwsRegion")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-aggregationauthorization.html)
 */
public open class CfnAggregationAuthorization(
  cdkObject: software.amazon.awscdk.services.config.CfnAggregationAuthorization,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAggregationAuthorizationProps,
  ) :
      this(software.amazon.awscdk.services.config.CfnAggregationAuthorization(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnAggregationAuthorizationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAggregationAuthorizationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnAggregationAuthorizationProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the aggregation object.
   */
  public open fun attrAggregationAuthorizationArn(): String =
      unwrap(this).getAttrAggregationAuthorizationArn()

  /**
   * The 12-digit account ID of the account authorized to aggregate data.
   */
  public open fun authorizedAccountId(): String = unwrap(this).getAuthorizedAccountId()

  /**
   * The 12-digit account ID of the account authorized to aggregate data.
   */
  public open fun authorizedAccountId(`value`: String) {
    unwrap(this).setAuthorizedAccountId(`value`)
  }

  /**
   * The region authorized to collect aggregated data.
   */
  public open fun authorizedAwsRegion(): String = unwrap(this).getAuthorizedAwsRegion()

  /**
   * The region authorized to collect aggregated data.
   */
  public open fun authorizedAwsRegion(`value`: String) {
    unwrap(this).setAuthorizedAwsRegion(`value`)
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
   * An array of tag object.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of tag object.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * An array of tag object.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.config.CfnAggregationAuthorization].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The 12-digit account ID of the account authorized to aggregate data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-aggregationauthorization.html#cfn-config-aggregationauthorization-authorizedaccountid)
     * @param authorizedAccountId The 12-digit account ID of the account authorized to aggregate
     * data. 
     */
    public fun authorizedAccountId(authorizedAccountId: String)

    /**
     * The region authorized to collect aggregated data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-aggregationauthorization.html#cfn-config-aggregationauthorization-authorizedawsregion)
     * @param authorizedAwsRegion The region authorized to collect aggregated data. 
     */
    public fun authorizedAwsRegion(authorizedAwsRegion: String)

    /**
     * An array of tag object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-aggregationauthorization.html#cfn-config-aggregationauthorization-tags)
     * @param tags An array of tag object. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of tag object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-aggregationauthorization.html#cfn-config-aggregationauthorization-tags)
     * @param tags An array of tag object. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.config.CfnAggregationAuthorization.Builder =
        software.amazon.awscdk.services.config.CfnAggregationAuthorization.Builder.create(scope, id)

    /**
     * The 12-digit account ID of the account authorized to aggregate data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-aggregationauthorization.html#cfn-config-aggregationauthorization-authorizedaccountid)
     * @param authorizedAccountId The 12-digit account ID of the account authorized to aggregate
     * data. 
     */
    override fun authorizedAccountId(authorizedAccountId: String) {
      cdkBuilder.authorizedAccountId(authorizedAccountId)
    }

    /**
     * The region authorized to collect aggregated data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-aggregationauthorization.html#cfn-config-aggregationauthorization-authorizedawsregion)
     * @param authorizedAwsRegion The region authorized to collect aggregated data. 
     */
    override fun authorizedAwsRegion(authorizedAwsRegion: String) {
      cdkBuilder.authorizedAwsRegion(authorizedAwsRegion)
    }

    /**
     * An array of tag object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-aggregationauthorization.html#cfn-config-aggregationauthorization-tags)
     * @param tags An array of tag object. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An array of tag object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-aggregationauthorization.html#cfn-config-aggregationauthorization-tags)
     * @param tags An array of tag object. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.config.CfnAggregationAuthorization =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.config.CfnAggregationAuthorization.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAggregationAuthorization {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAggregationAuthorization(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnAggregationAuthorization):
        CfnAggregationAuthorization = CfnAggregationAuthorization(cdkObject)

    internal fun unwrap(wrapped: CfnAggregationAuthorization):
        software.amazon.awscdk.services.config.CfnAggregationAuthorization = wrapped.cdkObject as
        software.amazon.awscdk.services.config.CfnAggregationAuthorization
  }
}
