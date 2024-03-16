@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.groundstation

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnMissionProfile`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.groundstation.*;
 * CfnMissionProfileProps cfnMissionProfileProps = CfnMissionProfileProps.builder()
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
public interface CfnMissionProfileProps {
  /**
   * Amount of time in seconds after a contact ends that you’d like to receive a Ground Station
   * Contact State Change indicating the pass has finished.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html#cfn-groundstation-missionprofile-contactpostpassdurationseconds)
   */
  public fun contactPostPassDurationSeconds(): Number? =
      unwrap(this).getContactPostPassDurationSeconds()

  /**
   * Amount of time in seconds prior to contact start that you'd like to receive a Ground Station
   * Contact State Change Event indicating an upcoming pass.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html#cfn-groundstation-missionprofile-contactprepassdurationseconds)
   */
  public fun contactPrePassDurationSeconds(): Number? =
      unwrap(this).getContactPrePassDurationSeconds()

  /**
   * A list containing lists of config ARNs.
   *
   * Each list of config ARNs is an edge, with a "from" config and a "to" config.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html#cfn-groundstation-missionprofile-dataflowedges)
   */
  public fun dataflowEdges(): Any

  /**
   * Minimum length of a contact in seconds that Ground Station will return when listing contacts.
   *
   * Ground Station will not return contacts shorter than this duration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html#cfn-groundstation-missionprofile-minimumviablecontactdurationseconds)
   */
  public fun minimumViableContactDurationSeconds(): Number

  /**
   * The name of the mission profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html#cfn-groundstation-missionprofile-name)
   */
  public fun name(): String

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html#cfn-groundstation-missionprofile-streamskmskey)
   */
  public fun streamsKmsKey(): Any? = unwrap(this).getStreamsKmsKey()

  /**
   * The ARN of the KMS Key or Alias Key role used to define permissions on KMS Key usage.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html#cfn-groundstation-missionprofile-streamskmsrole)
   */
  public fun streamsKmsRole(): String? = unwrap(this).getStreamsKmsRole()

  /**
   * Tags assigned to the mission profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html#cfn-groundstation-missionprofile-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The ARN of a tracking config objects that defines how to track the satellite through the sky
   * during a contact.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html#cfn-groundstation-missionprofile-trackingconfigarn)
   */
  public fun trackingConfigArn(): String

  /**
   * A builder for [CfnMissionProfileProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param contactPostPassDurationSeconds Amount of time in seconds after a contact ends that
     * you’d like to receive a Ground Station Contact State Change indicating the pass has finished.
     */
    public fun contactPostPassDurationSeconds(contactPostPassDurationSeconds: Number)

    /**
     * @param contactPrePassDurationSeconds Amount of time in seconds prior to contact start that
     * you'd like to receive a Ground Station Contact State Change Event indicating an upcoming pass.
     */
    public fun contactPrePassDurationSeconds(contactPrePassDurationSeconds: Number)

    /**
     * @param dataflowEdges A list containing lists of config ARNs. 
     * Each list of config ARNs is an edge, with a "from" config and a "to" config.
     */
    public fun dataflowEdges(dataflowEdges: IResolvable)

    /**
     * @param dataflowEdges A list containing lists of config ARNs. 
     * Each list of config ARNs is an edge, with a "from" config and a "to" config.
     */
    public fun dataflowEdges(dataflowEdges: List<Any>)

    /**
     * @param dataflowEdges A list containing lists of config ARNs. 
     * Each list of config ARNs is an edge, with a "from" config and a "to" config.
     */
    public fun dataflowEdges(vararg dataflowEdges: Any)

    /**
     * @param minimumViableContactDurationSeconds Minimum length of a contact in seconds that Ground
     * Station will return when listing contacts. 
     * Ground Station will not return contacts shorter than this duration.
     */
    public fun minimumViableContactDurationSeconds(minimumViableContactDurationSeconds: Number)

    /**
     * @param name The name of the mission profile. 
     */
    public fun name(name: String)

    /**
     * @param streamsKmsKey the value to be set.
     */
    public fun streamsKmsKey(streamsKmsKey: IResolvable)

    /**
     * @param streamsKmsKey the value to be set.
     */
    public fun streamsKmsKey(streamsKmsKey: CfnMissionProfile.StreamsKmsKeyProperty)

    /**
     * @param streamsKmsKey the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("117b35e3da185b448b5d987c3d2710e6ac6a0b3721dc9c7452a754f8b44e93a3")
    public
        fun streamsKmsKey(streamsKmsKey: CfnMissionProfile.StreamsKmsKeyProperty.Builder.() -> Unit)

    /**
     * @param streamsKmsRole The ARN of the KMS Key or Alias Key role used to define permissions on
     * KMS Key usage.
     */
    public fun streamsKmsRole(streamsKmsRole: String)

    /**
     * @param tags Tags assigned to the mission profile.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Tags assigned to the mission profile.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param trackingConfigArn The ARN of a tracking config objects that defines how to track the
     * satellite through the sky during a contact. 
     */
    public fun trackingConfigArn(trackingConfigArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.groundstation.CfnMissionProfileProps.Builder =
        software.amazon.awscdk.services.groundstation.CfnMissionProfileProps.builder()

    /**
     * @param contactPostPassDurationSeconds Amount of time in seconds after a contact ends that
     * you’d like to receive a Ground Station Contact State Change indicating the pass has finished.
     */
    override fun contactPostPassDurationSeconds(contactPostPassDurationSeconds: Number) {
      cdkBuilder.contactPostPassDurationSeconds(contactPostPassDurationSeconds)
    }

    /**
     * @param contactPrePassDurationSeconds Amount of time in seconds prior to contact start that
     * you'd like to receive a Ground Station Contact State Change Event indicating an upcoming pass.
     */
    override fun contactPrePassDurationSeconds(contactPrePassDurationSeconds: Number) {
      cdkBuilder.contactPrePassDurationSeconds(contactPrePassDurationSeconds)
    }

    /**
     * @param dataflowEdges A list containing lists of config ARNs. 
     * Each list of config ARNs is an edge, with a "from" config and a "to" config.
     */
    override fun dataflowEdges(dataflowEdges: IResolvable) {
      cdkBuilder.dataflowEdges(dataflowEdges.let(IResolvable::unwrap))
    }

    /**
     * @param dataflowEdges A list containing lists of config ARNs. 
     * Each list of config ARNs is an edge, with a "from" config and a "to" config.
     */
    override fun dataflowEdges(dataflowEdges: List<Any>) {
      cdkBuilder.dataflowEdges(dataflowEdges)
    }

    /**
     * @param dataflowEdges A list containing lists of config ARNs. 
     * Each list of config ARNs is an edge, with a "from" config and a "to" config.
     */
    override fun dataflowEdges(vararg dataflowEdges: Any): Unit =
        dataflowEdges(dataflowEdges.toList())

    /**
     * @param minimumViableContactDurationSeconds Minimum length of a contact in seconds that Ground
     * Station will return when listing contacts. 
     * Ground Station will not return contacts shorter than this duration.
     */
    override fun minimumViableContactDurationSeconds(minimumViableContactDurationSeconds: Number) {
      cdkBuilder.minimumViableContactDurationSeconds(minimumViableContactDurationSeconds)
    }

    /**
     * @param name The name of the mission profile. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param streamsKmsKey the value to be set.
     */
    override fun streamsKmsKey(streamsKmsKey: IResolvable) {
      cdkBuilder.streamsKmsKey(streamsKmsKey.let(IResolvable::unwrap))
    }

    /**
     * @param streamsKmsKey the value to be set.
     */
    override fun streamsKmsKey(streamsKmsKey: CfnMissionProfile.StreamsKmsKeyProperty) {
      cdkBuilder.streamsKmsKey(streamsKmsKey.let(CfnMissionProfile.StreamsKmsKeyProperty::unwrap))
    }

    /**
     * @param streamsKmsKey the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("117b35e3da185b448b5d987c3d2710e6ac6a0b3721dc9c7452a754f8b44e93a3")
    override
        fun streamsKmsKey(streamsKmsKey: CfnMissionProfile.StreamsKmsKeyProperty.Builder.() -> Unit):
        Unit = streamsKmsKey(CfnMissionProfile.StreamsKmsKeyProperty(streamsKmsKey))

    /**
     * @param streamsKmsRole The ARN of the KMS Key or Alias Key role used to define permissions on
     * KMS Key usage.
     */
    override fun streamsKmsRole(streamsKmsRole: String) {
      cdkBuilder.streamsKmsRole(streamsKmsRole)
    }

    /**
     * @param tags Tags assigned to the mission profile.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Tags assigned to the mission profile.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param trackingConfigArn The ARN of a tracking config objects that defines how to track the
     * satellite through the sky during a contact. 
     */
    override fun trackingConfigArn(trackingConfigArn: String) {
      cdkBuilder.trackingConfigArn(trackingConfigArn)
    }

    public fun build(): software.amazon.awscdk.services.groundstation.CfnMissionProfileProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.groundstation.CfnMissionProfileProps,
  ) : CdkObject(cdkObject), CfnMissionProfileProps {
    /**
     * Amount of time in seconds after a contact ends that you’d like to receive a Ground Station
     * Contact State Change indicating the pass has finished.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html#cfn-groundstation-missionprofile-contactpostpassdurationseconds)
     */
    override fun contactPostPassDurationSeconds(): Number? =
        unwrap(this).getContactPostPassDurationSeconds()

    /**
     * Amount of time in seconds prior to contact start that you'd like to receive a Ground Station
     * Contact State Change Event indicating an upcoming pass.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html#cfn-groundstation-missionprofile-contactprepassdurationseconds)
     */
    override fun contactPrePassDurationSeconds(): Number? =
        unwrap(this).getContactPrePassDurationSeconds()

    /**
     * A list containing lists of config ARNs.
     *
     * Each list of config ARNs is an edge, with a "from" config and a "to" config.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html#cfn-groundstation-missionprofile-dataflowedges)
     */
    override fun dataflowEdges(): Any = unwrap(this).getDataflowEdges()

    /**
     * Minimum length of a contact in seconds that Ground Station will return when listing contacts.
     *
     * Ground Station will not return contacts shorter than this duration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html#cfn-groundstation-missionprofile-minimumviablecontactdurationseconds)
     */
    override fun minimumViableContactDurationSeconds(): Number =
        unwrap(this).getMinimumViableContactDurationSeconds()

    /**
     * The name of the mission profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html#cfn-groundstation-missionprofile-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html#cfn-groundstation-missionprofile-streamskmskey)
     */
    override fun streamsKmsKey(): Any? = unwrap(this).getStreamsKmsKey()

    /**
     * The ARN of the KMS Key or Alias Key role used to define permissions on KMS Key usage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html#cfn-groundstation-missionprofile-streamskmsrole)
     */
    override fun streamsKmsRole(): String? = unwrap(this).getStreamsKmsRole()

    /**
     * Tags assigned to the mission profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html#cfn-groundstation-missionprofile-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The ARN of a tracking config objects that defines how to track the satellite through the sky
     * during a contact.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html#cfn-groundstation-missionprofile-trackingconfigarn)
     */
    override fun trackingConfigArn(): String = unwrap(this).getTrackingConfigArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMissionProfileProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnMissionProfileProps):
        CfnMissionProfileProps = CdkObjectWrappers.wrap(cdkObject) as CfnMissionProfileProps

    internal fun unwrap(wrapped: CfnMissionProfileProps):
        software.amazon.awscdk.services.groundstation.CfnMissionProfileProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.groundstation.CfnMissionProfileProps
  }
}
