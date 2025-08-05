@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.omics

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a run group to limit the compute resources for the runs that are added to the group.
 *
 * Returns an ARN, ID, and tags for the run group.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.omics.*;
 * CfnRunGroup cfnRunGroup = CfnRunGroup.Builder.create(this, "MyCfnRunGroup")
 * .maxCpus(123)
 * .maxDuration(123)
 * .maxGpus(123)
 * .maxRuns(123)
 * .name("name")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-rungroup.html)
 */
public open class CfnRunGroup(
  cdkObject: software.amazon.awscdk.services.omics.CfnRunGroup,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.omics.CfnRunGroup(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRunGroupProps,
  ) :
      this(software.amazon.awscdk.services.omics.CfnRunGroup(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnRunGroupProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRunGroupProps.Builder.() -> Unit,
  ) : this(scope, id, CfnRunGroupProps(props)
  )

  /**
   * The run group's ARN.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * When the run group was created.
   */
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  /**
   * The run group's ID.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The group's maximum CPU count setting.
   */
  public open fun maxCpus(): Number? = unwrap(this).getMaxCpus()

  /**
   * The group's maximum CPU count setting.
   */
  public open fun maxCpus(`value`: Number) {
    unwrap(this).setMaxCpus(`value`)
  }

  /**
   * The group's maximum duration setting in minutes.
   */
  public open fun maxDuration(): Number? = unwrap(this).getMaxDuration()

  /**
   * The group's maximum duration setting in minutes.
   */
  public open fun maxDuration(`value`: Number) {
    unwrap(this).setMaxDuration(`value`)
  }

  /**
   * The maximum GPUs that can be used by a run group.
   */
  public open fun maxGpus(): Number? = unwrap(this).getMaxGpus()

  /**
   * The maximum GPUs that can be used by a run group.
   */
  public open fun maxGpus(`value`: Number) {
    unwrap(this).setMaxGpus(`value`)
  }

  /**
   * The group's maximum concurrent run setting.
   */
  public open fun maxRuns(): Number? = unwrap(this).getMaxRuns()

  /**
   * The group's maximum concurrent run setting.
   */
  public open fun maxRuns(`value`: Number) {
    unwrap(this).setMaxRuns(`value`)
  }

  /**
   * The group's name.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The group's name.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Tags for the group.
   */
  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  /**
   * Tags for the group.
   */
  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.omics.CfnRunGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The group's maximum CPU count setting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-rungroup.html#cfn-omics-rungroup-maxcpus)
     * @param maxCpus The group's maximum CPU count setting. 
     */
    public fun maxCpus(maxCpus: Number)

    /**
     * The group's maximum duration setting in minutes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-rungroup.html#cfn-omics-rungroup-maxduration)
     * @param maxDuration The group's maximum duration setting in minutes. 
     */
    public fun maxDuration(maxDuration: Number)

    /**
     * The maximum GPUs that can be used by a run group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-rungroup.html#cfn-omics-rungroup-maxgpus)
     * @param maxGpus The maximum GPUs that can be used by a run group. 
     */
    public fun maxGpus(maxGpus: Number)

    /**
     * The group's maximum concurrent run setting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-rungroup.html#cfn-omics-rungroup-maxruns)
     * @param maxRuns The group's maximum concurrent run setting. 
     */
    public fun maxRuns(maxRuns: Number)

    /**
     * The group's name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-rungroup.html#cfn-omics-rungroup-name)
     * @param name The group's name. 
     */
    public fun name(name: String)

    /**
     * Tags for the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-rungroup.html#cfn-omics-rungroup-tags)
     * @param tags Tags for the group. 
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.omics.CfnRunGroup.Builder =
        software.amazon.awscdk.services.omics.CfnRunGroup.Builder.create(scope, id)

    /**
     * The group's maximum CPU count setting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-rungroup.html#cfn-omics-rungroup-maxcpus)
     * @param maxCpus The group's maximum CPU count setting. 
     */
    override fun maxCpus(maxCpus: Number) {
      cdkBuilder.maxCpus(maxCpus)
    }

    /**
     * The group's maximum duration setting in minutes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-rungroup.html#cfn-omics-rungroup-maxduration)
     * @param maxDuration The group's maximum duration setting in minutes. 
     */
    override fun maxDuration(maxDuration: Number) {
      cdkBuilder.maxDuration(maxDuration)
    }

    /**
     * The maximum GPUs that can be used by a run group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-rungroup.html#cfn-omics-rungroup-maxgpus)
     * @param maxGpus The maximum GPUs that can be used by a run group. 
     */
    override fun maxGpus(maxGpus: Number) {
      cdkBuilder.maxGpus(maxGpus)
    }

    /**
     * The group's maximum concurrent run setting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-rungroup.html#cfn-omics-rungroup-maxruns)
     * @param maxRuns The group's maximum concurrent run setting. 
     */
    override fun maxRuns(maxRuns: Number) {
      cdkBuilder.maxRuns(maxRuns)
    }

    /**
     * The group's name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-rungroup.html#cfn-omics-rungroup-name)
     * @param name The group's name. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Tags for the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-rungroup.html#cfn-omics-rungroup-tags)
     * @param tags Tags for the group. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.omics.CfnRunGroup = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.omics.CfnRunGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRunGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRunGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.omics.CfnRunGroup): CfnRunGroup =
        CfnRunGroup(cdkObject)

    internal fun unwrap(wrapped: CfnRunGroup): software.amazon.awscdk.services.omics.CfnRunGroup =
        wrapped.cdkObject as software.amazon.awscdk.services.omics.CfnRunGroup
  }
}
