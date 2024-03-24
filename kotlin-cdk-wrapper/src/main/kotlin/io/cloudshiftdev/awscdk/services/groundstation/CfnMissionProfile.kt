@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.groundstation

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
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Mission profiles specify parameters and provide references to config objects to define how Ground
 * Station lists and executes contacts.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.groundstation.*;
 * CfnMissionProfile cfnMissionProfile = CfnMissionProfile.Builder.create(this,
 * "MyCfnMissionProfile")
 * .dataflowEdges(List.of(DataflowEdgeProperty.builder()
 * .destination("destination")
 * .source("source")
 * .build()))
 * .minimumViableContactDurationSeconds(123)
 * .name("name")
 * .trackingConfigArn("trackingConfigArn")
 * // the properties below are optional
 * .contactPostPassDurationSeconds(123)
 * .contactPrePassDurationSeconds(123)
 * .streamsKmsKey(StreamsKmsKeyProperty.builder()
 * .kmsAliasArn("kmsAliasArn")
 * .kmsKeyArn("kmsKeyArn")
 * .build())
 * .streamsKmsRole("streamsKmsRole")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html)
 */
public open class CfnMissionProfile(
  cdkObject: software.amazon.awscdk.services.groundstation.CfnMissionProfile,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnMissionProfileProps,
  ) :
      this(software.amazon.awscdk.services.groundstation.CfnMissionProfile(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnMissionProfileProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnMissionProfileProps.Builder.() -> Unit,
  ) : this(scope, id, CfnMissionProfileProps(props)
  )

  /**
   * The ARN of the mission profile, such as
   * `arn:aws:groundstation:us-east-2:1234567890:mission-profile/9940bf3b-d2ba-427e-9906-842b5e5d2296`
   * .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The ID of the mission profile, such as `9940bf3b-d2ba-427e-9906-842b5e5d2296` .
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The region of the mission profile.
   */
  public open fun attrRegion(): String = unwrap(this).getAttrRegion()

  /**
   * Amount of time in seconds after a contact ends that you’d like to receive a Ground Station
   * Contact State Change indicating the pass has finished.
   */
  public open fun contactPostPassDurationSeconds(): Number? =
      unwrap(this).getContactPostPassDurationSeconds()

  /**
   * Amount of time in seconds after a contact ends that you’d like to receive a Ground Station
   * Contact State Change indicating the pass has finished.
   */
  public open fun contactPostPassDurationSeconds(`value`: Number) {
    unwrap(this).setContactPostPassDurationSeconds(`value`)
  }

  /**
   * Amount of time in seconds prior to contact start that you'd like to receive a Ground Station
   * Contact State Change Event indicating an upcoming pass.
   */
  public open fun contactPrePassDurationSeconds(): Number? =
      unwrap(this).getContactPrePassDurationSeconds()

  /**
   * Amount of time in seconds prior to contact start that you'd like to receive a Ground Station
   * Contact State Change Event indicating an upcoming pass.
   */
  public open fun contactPrePassDurationSeconds(`value`: Number) {
    unwrap(this).setContactPrePassDurationSeconds(`value`)
  }

  /**
   * A list containing lists of config ARNs.
   */
  public open fun dataflowEdges(): Any = unwrap(this).getDataflowEdges()

  /**
   * A list containing lists of config ARNs.
   */
  public open fun dataflowEdges(`value`: IResolvable) {
    unwrap(this).setDataflowEdges(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list containing lists of config ARNs.
   */
  public open fun dataflowEdges(`value`: List<Any>) {
    unwrap(this).setDataflowEdges(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * A list containing lists of config ARNs.
   */
  public open fun dataflowEdges(vararg `value`: Any): Unit = dataflowEdges(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Minimum length of a contact in seconds that Ground Station will return when listing contacts.
   */
  public open fun minimumViableContactDurationSeconds(): Number =
      unwrap(this).getMinimumViableContactDurationSeconds()

  /**
   * Minimum length of a contact in seconds that Ground Station will return when listing contacts.
   */
  public open fun minimumViableContactDurationSeconds(`value`: Number) {
    unwrap(this).setMinimumViableContactDurationSeconds(`value`)
  }

  /**
   * The name of the mission profile.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the mission profile.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   *
   */
  public open fun streamsKmsKey(): Any? = unwrap(this).getStreamsKmsKey()

  /**
   *
   */
  public open fun streamsKmsKey(`value`: IResolvable) {
    unwrap(this).setStreamsKmsKey(`value`.let(IResolvable::unwrap))
  }

  /**
   *
   */
  public open fun streamsKmsKey(`value`: StreamsKmsKeyProperty) {
    unwrap(this).setStreamsKmsKey(`value`.let(StreamsKmsKeyProperty::unwrap))
  }

  /**
   *
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1f3863d9084b4f2b76f507b753b13a5b0fe4dedbd1bc86cfb909b0c063605f13")
  public open fun streamsKmsKey(`value`: StreamsKmsKeyProperty.Builder.() -> Unit): Unit =
      streamsKmsKey(StreamsKmsKeyProperty(`value`))

  /**
   * The ARN of the KMS Key or Alias Key role used to define permissions on KMS Key usage.
   */
  public open fun streamsKmsRole(): String? = unwrap(this).getStreamsKmsRole()

  /**
   * The ARN of the KMS Key or Alias Key role used to define permissions on KMS Key usage.
   */
  public open fun streamsKmsRole(`value`: String) {
    unwrap(this).setStreamsKmsRole(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Tags assigned to the mission profile.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Tags assigned to the mission profile.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Tags assigned to the mission profile.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The ARN of a tracking config objects that defines how to track the satellite through the sky
   * during a contact.
   */
  public open fun trackingConfigArn(): String = unwrap(this).getTrackingConfigArn()

  /**
   * The ARN of a tracking config objects that defines how to track the satellite through the sky
   * during a contact.
   */
  public open fun trackingConfigArn(`value`: String) {
    unwrap(this).setTrackingConfigArn(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.groundstation.CfnMissionProfile].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Amount of time in seconds after a contact ends that you’d like to receive a Ground Station
     * Contact State Change indicating the pass has finished.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html#cfn-groundstation-missionprofile-contactpostpassdurationseconds)
     * @param contactPostPassDurationSeconds Amount of time in seconds after a contact ends that
     * you’d like to receive a Ground Station Contact State Change indicating the pass has finished. 
     */
    public fun contactPostPassDurationSeconds(contactPostPassDurationSeconds: Number)

    /**
     * Amount of time in seconds prior to contact start that you'd like to receive a Ground Station
     * Contact State Change Event indicating an upcoming pass.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html#cfn-groundstation-missionprofile-contactprepassdurationseconds)
     * @param contactPrePassDurationSeconds Amount of time in seconds prior to contact start that
     * you'd like to receive a Ground Station Contact State Change Event indicating an upcoming pass. 
     */
    public fun contactPrePassDurationSeconds(contactPrePassDurationSeconds: Number)

    /**
     * A list containing lists of config ARNs.
     *
     * Each list of config ARNs is an edge, with a "from" config and a "to" config.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html#cfn-groundstation-missionprofile-dataflowedges)
     * @param dataflowEdges A list containing lists of config ARNs. 
     */
    public fun dataflowEdges(dataflowEdges: IResolvable)

    /**
     * A list containing lists of config ARNs.
     *
     * Each list of config ARNs is an edge, with a "from" config and a "to" config.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html#cfn-groundstation-missionprofile-dataflowedges)
     * @param dataflowEdges A list containing lists of config ARNs. 
     */
    public fun dataflowEdges(dataflowEdges: List<Any>)

    /**
     * A list containing lists of config ARNs.
     *
     * Each list of config ARNs is an edge, with a "from" config and a "to" config.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html#cfn-groundstation-missionprofile-dataflowedges)
     * @param dataflowEdges A list containing lists of config ARNs. 
     */
    public fun dataflowEdges(vararg dataflowEdges: Any)

    /**
     * Minimum length of a contact in seconds that Ground Station will return when listing contacts.
     *
     * Ground Station will not return contacts shorter than this duration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html#cfn-groundstation-missionprofile-minimumviablecontactdurationseconds)
     * @param minimumViableContactDurationSeconds Minimum length of a contact in seconds that Ground
     * Station will return when listing contacts. 
     */
    public fun minimumViableContactDurationSeconds(minimumViableContactDurationSeconds: Number)

    /**
     * The name of the mission profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html#cfn-groundstation-missionprofile-name)
     * @param name The name of the mission profile. 
     */
    public fun name(name: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html#cfn-groundstation-missionprofile-streamskmskey)
     * @param streamsKmsKey 
     */
    public fun streamsKmsKey(streamsKmsKey: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html#cfn-groundstation-missionprofile-streamskmskey)
     * @param streamsKmsKey 
     */
    public fun streamsKmsKey(streamsKmsKey: StreamsKmsKeyProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html#cfn-groundstation-missionprofile-streamskmskey)
     * @param streamsKmsKey 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9a09ec7ec13e230f3f45aa7de99c440ccde072210f485be7f3c016e1744c5370")
    public fun streamsKmsKey(streamsKmsKey: StreamsKmsKeyProperty.Builder.() -> Unit)

    /**
     * The ARN of the KMS Key or Alias Key role used to define permissions on KMS Key usage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html#cfn-groundstation-missionprofile-streamskmsrole)
     * @param streamsKmsRole The ARN of the KMS Key or Alias Key role used to define permissions on
     * KMS Key usage. 
     */
    public fun streamsKmsRole(streamsKmsRole: String)

    /**
     * Tags assigned to the mission profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html#cfn-groundstation-missionprofile-tags)
     * @param tags Tags assigned to the mission profile. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Tags assigned to the mission profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html#cfn-groundstation-missionprofile-tags)
     * @param tags Tags assigned to the mission profile. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The ARN of a tracking config objects that defines how to track the satellite through the sky
     * during a contact.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html#cfn-groundstation-missionprofile-trackingconfigarn)
     * @param trackingConfigArn The ARN of a tracking config objects that defines how to track the
     * satellite through the sky during a contact. 
     */
    public fun trackingConfigArn(trackingConfigArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.groundstation.CfnMissionProfile.Builder
        = software.amazon.awscdk.services.groundstation.CfnMissionProfile.Builder.create(scope, id)

    /**
     * Amount of time in seconds after a contact ends that you’d like to receive a Ground Station
     * Contact State Change indicating the pass has finished.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html#cfn-groundstation-missionprofile-contactpostpassdurationseconds)
     * @param contactPostPassDurationSeconds Amount of time in seconds after a contact ends that
     * you’d like to receive a Ground Station Contact State Change indicating the pass has finished. 
     */
    override fun contactPostPassDurationSeconds(contactPostPassDurationSeconds: Number) {
      cdkBuilder.contactPostPassDurationSeconds(contactPostPassDurationSeconds)
    }

    /**
     * Amount of time in seconds prior to contact start that you'd like to receive a Ground Station
     * Contact State Change Event indicating an upcoming pass.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html#cfn-groundstation-missionprofile-contactprepassdurationseconds)
     * @param contactPrePassDurationSeconds Amount of time in seconds prior to contact start that
     * you'd like to receive a Ground Station Contact State Change Event indicating an upcoming pass. 
     */
    override fun contactPrePassDurationSeconds(contactPrePassDurationSeconds: Number) {
      cdkBuilder.contactPrePassDurationSeconds(contactPrePassDurationSeconds)
    }

    /**
     * A list containing lists of config ARNs.
     *
     * Each list of config ARNs is an edge, with a "from" config and a "to" config.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html#cfn-groundstation-missionprofile-dataflowedges)
     * @param dataflowEdges A list containing lists of config ARNs. 
     */
    override fun dataflowEdges(dataflowEdges: IResolvable) {
      cdkBuilder.dataflowEdges(dataflowEdges.let(IResolvable::unwrap))
    }

    /**
     * A list containing lists of config ARNs.
     *
     * Each list of config ARNs is an edge, with a "from" config and a "to" config.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html#cfn-groundstation-missionprofile-dataflowedges)
     * @param dataflowEdges A list containing lists of config ARNs. 
     */
    override fun dataflowEdges(dataflowEdges: List<Any>) {
      cdkBuilder.dataflowEdges(dataflowEdges.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * A list containing lists of config ARNs.
     *
     * Each list of config ARNs is an edge, with a "from" config and a "to" config.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html#cfn-groundstation-missionprofile-dataflowedges)
     * @param dataflowEdges A list containing lists of config ARNs. 
     */
    override fun dataflowEdges(vararg dataflowEdges: Any): Unit =
        dataflowEdges(dataflowEdges.toList())

    /**
     * Minimum length of a contact in seconds that Ground Station will return when listing contacts.
     *
     * Ground Station will not return contacts shorter than this duration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html#cfn-groundstation-missionprofile-minimumviablecontactdurationseconds)
     * @param minimumViableContactDurationSeconds Minimum length of a contact in seconds that Ground
     * Station will return when listing contacts. 
     */
    override fun minimumViableContactDurationSeconds(minimumViableContactDurationSeconds: Number) {
      cdkBuilder.minimumViableContactDurationSeconds(minimumViableContactDurationSeconds)
    }

    /**
     * The name of the mission profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html#cfn-groundstation-missionprofile-name)
     * @param name The name of the mission profile. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html#cfn-groundstation-missionprofile-streamskmskey)
     * @param streamsKmsKey 
     */
    override fun streamsKmsKey(streamsKmsKey: IResolvable) {
      cdkBuilder.streamsKmsKey(streamsKmsKey.let(IResolvable::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html#cfn-groundstation-missionprofile-streamskmskey)
     * @param streamsKmsKey 
     */
    override fun streamsKmsKey(streamsKmsKey: StreamsKmsKeyProperty) {
      cdkBuilder.streamsKmsKey(streamsKmsKey.let(StreamsKmsKeyProperty::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html#cfn-groundstation-missionprofile-streamskmskey)
     * @param streamsKmsKey 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9a09ec7ec13e230f3f45aa7de99c440ccde072210f485be7f3c016e1744c5370")
    override fun streamsKmsKey(streamsKmsKey: StreamsKmsKeyProperty.Builder.() -> Unit): Unit =
        streamsKmsKey(StreamsKmsKeyProperty(streamsKmsKey))

    /**
     * The ARN of the KMS Key or Alias Key role used to define permissions on KMS Key usage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html#cfn-groundstation-missionprofile-streamskmsrole)
     * @param streamsKmsRole The ARN of the KMS Key or Alias Key role used to define permissions on
     * KMS Key usage. 
     */
    override fun streamsKmsRole(streamsKmsRole: String) {
      cdkBuilder.streamsKmsRole(streamsKmsRole)
    }

    /**
     * Tags assigned to the mission profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html#cfn-groundstation-missionprofile-tags)
     * @param tags Tags assigned to the mission profile. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Tags assigned to the mission profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html#cfn-groundstation-missionprofile-tags)
     * @param tags Tags assigned to the mission profile. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The ARN of a tracking config objects that defines how to track the satellite through the sky
     * during a contact.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html#cfn-groundstation-missionprofile-trackingconfigarn)
     * @param trackingConfigArn The ARN of a tracking config objects that defines how to track the
     * satellite through the sky during a contact. 
     */
    override fun trackingConfigArn(trackingConfigArn: String) {
      cdkBuilder.trackingConfigArn(trackingConfigArn)
    }

    public fun build(): software.amazon.awscdk.services.groundstation.CfnMissionProfile =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.groundstation.CfnMissionProfile.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMissionProfile {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMissionProfile(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnMissionProfile):
        CfnMissionProfile = CfnMissionProfile(cdkObject)

    internal fun unwrap(wrapped: CfnMissionProfile):
        software.amazon.awscdk.services.groundstation.CfnMissionProfile = wrapped.cdkObject as
        software.amazon.awscdk.services.groundstation.CfnMissionProfile
  }

  /**
   * A dataflow edge defines from where and to where data will flow during a contact.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.groundstation.*;
   * DataflowEdgeProperty dataflowEdgeProperty = DataflowEdgeProperty.builder()
   * .destination("destination")
   * .source("source")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-missionprofile-dataflowedge.html)
   */
  public interface DataflowEdgeProperty {
    /**
     * The ARN of the destination for this dataflow edge.
     *
     * For example, specify the ARN of a dataflow endpoint config for a downlink edge or an antenna
     * uplink config for an uplink edge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-missionprofile-dataflowedge.html#cfn-groundstation-missionprofile-dataflowedge-destination)
     */
    public fun destination(): String? = unwrap(this).getDestination()

    /**
     * The ARN of the source for this dataflow edge.
     *
     * For example, specify the ARN of an antenna downlink config for a downlink edge or a dataflow
     * endpoint config for an uplink edge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-missionprofile-dataflowedge.html#cfn-groundstation-missionprofile-dataflowedge-source)
     */
    public fun source(): String? = unwrap(this).getSource()

    /**
     * A builder for [DataflowEdgeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param destination The ARN of the destination for this dataflow edge.
       * For example, specify the ARN of a dataflow endpoint config for a downlink edge or an
       * antenna uplink config for an uplink edge.
       */
      public fun destination(destination: String)

      /**
       * @param source The ARN of the source for this dataflow edge.
       * For example, specify the ARN of an antenna downlink config for a downlink edge or a
       * dataflow endpoint config for an uplink edge.
       */
      public fun source(source: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.groundstation.CfnMissionProfile.DataflowEdgeProperty.Builder
          =
          software.amazon.awscdk.services.groundstation.CfnMissionProfile.DataflowEdgeProperty.builder()

      /**
       * @param destination The ARN of the destination for this dataflow edge.
       * For example, specify the ARN of a dataflow endpoint config for a downlink edge or an
       * antenna uplink config for an uplink edge.
       */
      override fun destination(destination: String) {
        cdkBuilder.destination(destination)
      }

      /**
       * @param source The ARN of the source for this dataflow edge.
       * For example, specify the ARN of an antenna downlink config for a downlink edge or a
       * dataflow endpoint config for an uplink edge.
       */
      override fun source(source: String) {
        cdkBuilder.source(source)
      }

      public fun build():
          software.amazon.awscdk.services.groundstation.CfnMissionProfile.DataflowEdgeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.groundstation.CfnMissionProfile.DataflowEdgeProperty,
    ) : CdkObject(cdkObject), DataflowEdgeProperty {
      /**
       * The ARN of the destination for this dataflow edge.
       *
       * For example, specify the ARN of a dataflow endpoint config for a downlink edge or an
       * antenna uplink config for an uplink edge.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-missionprofile-dataflowedge.html#cfn-groundstation-missionprofile-dataflowedge-destination)
       */
      override fun destination(): String? = unwrap(this).getDestination()

      /**
       * The ARN of the source for this dataflow edge.
       *
       * For example, specify the ARN of an antenna downlink config for a downlink edge or a
       * dataflow endpoint config for an uplink edge.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-missionprofile-dataflowedge.html#cfn-groundstation-missionprofile-dataflowedge-source)
       */
      override fun source(): String? = unwrap(this).getSource()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DataflowEdgeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnMissionProfile.DataflowEdgeProperty):
          DataflowEdgeProperty = CdkObjectWrappers.wrap(cdkObject) as? DataflowEdgeProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataflowEdgeProperty):
          software.amazon.awscdk.services.groundstation.CfnMissionProfile.DataflowEdgeProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.groundstation.CfnMissionProfile.DataflowEdgeProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.groundstation.*;
   * StreamsKmsKeyProperty streamsKmsKeyProperty = StreamsKmsKeyProperty.builder()
   * .kmsAliasArn("kmsAliasArn")
   * .kmsKeyArn("kmsKeyArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-missionprofile-streamskmskey.html)
   */
  public interface StreamsKmsKeyProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-missionprofile-streamskmskey.html#cfn-groundstation-missionprofile-streamskmskey-kmsaliasarn)
     */
    public fun kmsAliasArn(): String? = unwrap(this).getKmsAliasArn()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-missionprofile-streamskmskey.html#cfn-groundstation-missionprofile-streamskmskey-kmskeyarn)
     */
    public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    /**
     * A builder for [StreamsKmsKeyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param kmsAliasArn the value to be set.
       */
      public fun kmsAliasArn(kmsAliasArn: String)

      /**
       * @param kmsKeyArn the value to be set.
       */
      public fun kmsKeyArn(kmsKeyArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.groundstation.CfnMissionProfile.StreamsKmsKeyProperty.Builder
          =
          software.amazon.awscdk.services.groundstation.CfnMissionProfile.StreamsKmsKeyProperty.builder()

      /**
       * @param kmsAliasArn the value to be set.
       */
      override fun kmsAliasArn(kmsAliasArn: String) {
        cdkBuilder.kmsAliasArn(kmsAliasArn)
      }

      /**
       * @param kmsKeyArn the value to be set.
       */
      override fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
      }

      public fun build():
          software.amazon.awscdk.services.groundstation.CfnMissionProfile.StreamsKmsKeyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.groundstation.CfnMissionProfile.StreamsKmsKeyProperty,
    ) : CdkObject(cdkObject), StreamsKmsKeyProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-missionprofile-streamskmskey.html#cfn-groundstation-missionprofile-streamskmskey-kmsaliasarn)
       */
      override fun kmsAliasArn(): String? = unwrap(this).getKmsAliasArn()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-missionprofile-streamskmskey.html#cfn-groundstation-missionprofile-streamskmskey-kmskeyarn)
       */
      override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StreamsKmsKeyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnMissionProfile.StreamsKmsKeyProperty):
          StreamsKmsKeyProperty = CdkObjectWrappers.wrap(cdkObject) as? StreamsKmsKeyProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: StreamsKmsKeyProperty):
          software.amazon.awscdk.services.groundstation.CfnMissionProfile.StreamsKmsKeyProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.groundstation.CfnMissionProfile.StreamsKmsKeyProperty
    }
  }
}
