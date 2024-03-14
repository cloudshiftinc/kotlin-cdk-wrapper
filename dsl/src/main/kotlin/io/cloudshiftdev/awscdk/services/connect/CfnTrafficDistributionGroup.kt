package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTrafficDistributionGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.connect.CfnTrafficDistributionGroup,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  /**
   * Describes whether this is the default traffic distribution group.
   */
  public open fun attrIsDefault(): IResolvable =
      unwrap(this).getAttrIsDefault().let(IResolvable::wrap)

  /**
   * The status of the traffic distribution group.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * The Amazon Resource Name (ARN) of the traffic distribution group.
   */
  public open fun attrTrafficDistributionGroupArn(): String =
      unwrap(this).getAttrTrafficDistributionGroupArn()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The description of the traffic distribution group.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the traffic distribution group.
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
   * The Amazon Resource Name (ARN).
   */
  public open fun instanceArn(): String = unwrap(this).getInstanceArn()

  /**
   * The Amazon Resource Name (ARN).
   */
  public open fun instanceArn(`value`: String) {
    unwrap(this).setInstanceArn(`value`)
  }

  /**
   * The name of the traffic distribution group.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the traffic distribution group.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.connect.CfnTrafficDistributionGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of the traffic distribution group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-trafficdistributiongroup.html#cfn-connect-trafficdistributiongroup-description)
     * @param description The description of the traffic distribution group. 
     */
    public fun description(description: String)

    /**
     * The Amazon Resource Name (ARN).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-trafficdistributiongroup.html#cfn-connect-trafficdistributiongroup-instancearn)
     * @param instanceArn The Amazon Resource Name (ARN). 
     */
    public fun instanceArn(instanceArn: String)

    /**
     * The name of the traffic distribution group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-trafficdistributiongroup.html#cfn-connect-trafficdistributiongroup-name)
     * @param name The name of the traffic distribution group. 
     */
    public fun name(name: String)

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, {"tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-trafficdistributiongroup.html#cfn-connect-trafficdistributiongroup-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, {"tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-trafficdistributiongroup.html#cfn-connect-trafficdistributiongroup-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.connect.CfnTrafficDistributionGroup.Builder =
        software.amazon.awscdk.services.connect.CfnTrafficDistributionGroup.Builder.create(scope,
        id)

    /**
     * The description of the traffic distribution group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-trafficdistributiongroup.html#cfn-connect-trafficdistributiongroup-description)
     * @param description The description of the traffic distribution group. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The Amazon Resource Name (ARN).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-trafficdistributiongroup.html#cfn-connect-trafficdistributiongroup-instancearn)
     * @param instanceArn The Amazon Resource Name (ARN). 
     */
    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    /**
     * The name of the traffic distribution group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-trafficdistributiongroup.html#cfn-connect-trafficdistributiongroup-name)
     * @param name The name of the traffic distribution group. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, {"tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-trafficdistributiongroup.html#cfn-connect-trafficdistributiongroup-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, {"tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-trafficdistributiongroup.html#cfn-connect-trafficdistributiongroup-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.connect.CfnTrafficDistributionGroup =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTrafficDistributionGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTrafficDistributionGroup(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnTrafficDistributionGroup):
        CfnTrafficDistributionGroup = CfnTrafficDistributionGroup(cdkObject)

    internal fun unwrap(wrapped: CfnTrafficDistributionGroup):
        software.amazon.awscdk.services.connect.CfnTrafficDistributionGroup = wrapped.cdkObject
  }
}
