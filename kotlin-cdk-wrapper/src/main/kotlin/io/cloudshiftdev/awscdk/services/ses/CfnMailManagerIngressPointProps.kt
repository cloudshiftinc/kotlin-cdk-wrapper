@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnMailManagerIngressPoint`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ses.*;
 * CfnMailManagerIngressPointProps cfnMailManagerIngressPointProps =
 * CfnMailManagerIngressPointProps.builder()
 * .ruleSetId("ruleSetId")
 * .trafficPolicyId("trafficPolicyId")
 * .type("type")
 * // the properties below are optional
 * .ingressPointConfiguration(IngressPointConfigurationProperty.builder()
 * .secretArn("secretArn")
 * .smtpPassword("smtpPassword")
 * .build())
 * .ingressPointName("ingressPointName")
 * .statusToUpdate("statusToUpdate")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageringresspoint.html)
 */
public interface CfnMailManagerIngressPointProps {
  /**
   * The configuration of the ingress endpoint resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageringresspoint.html#cfn-ses-mailmanageringresspoint-ingresspointconfiguration)
   */
  public fun ingressPointConfiguration(): Any? = unwrap(this).getIngressPointConfiguration()

  /**
   * A user friendly name for an ingress endpoint resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageringresspoint.html#cfn-ses-mailmanageringresspoint-ingresspointname)
   */
  public fun ingressPointName(): String? = unwrap(this).getIngressPointName()

  /**
   * The identifier of an existing rule set that you attach to an ingress endpoint resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageringresspoint.html#cfn-ses-mailmanageringresspoint-rulesetid)
   */
  public fun ruleSetId(): String

  /**
   * The update status of an ingress endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageringresspoint.html#cfn-ses-mailmanageringresspoint-statustoupdate)
   */
  public fun statusToUpdate(): String? = unwrap(this).getStatusToUpdate()

  /**
   * The tags used to organize, track, or control access for the resource.
   *
   * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageringresspoint.html#cfn-ses-mailmanageringresspoint-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The identifier of an existing traffic policy that you attach to an ingress endpoint resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageringresspoint.html#cfn-ses-mailmanageringresspoint-trafficpolicyid)
   */
  public fun trafficPolicyId(): String

  /**
   * The type of the ingress endpoint to create.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageringresspoint.html#cfn-ses-mailmanageringresspoint-type)
   */
  public fun type(): String

  /**
   * A builder for [CfnMailManagerIngressPointProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param ingressPointConfiguration The configuration of the ingress endpoint resource.
     */
    public fun ingressPointConfiguration(ingressPointConfiguration: IResolvable)

    /**
     * @param ingressPointConfiguration The configuration of the ingress endpoint resource.
     */
    public
        fun ingressPointConfiguration(ingressPointConfiguration: CfnMailManagerIngressPoint.IngressPointConfigurationProperty)

    /**
     * @param ingressPointConfiguration The configuration of the ingress endpoint resource.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dd7028c0f76d8507d34d6ebc4d5ffbc82e9ecad31b1ae8c55e1c95c6bb3aea47")
    public
        fun ingressPointConfiguration(ingressPointConfiguration: CfnMailManagerIngressPoint.IngressPointConfigurationProperty.Builder.() -> Unit)

    /**
     * @param ingressPointName A user friendly name for an ingress endpoint resource.
     */
    public fun ingressPointName(ingressPointName: String)

    /**
     * @param ruleSetId The identifier of an existing rule set that you attach to an ingress
     * endpoint resource. 
     */
    public fun ruleSetId(ruleSetId: String)

    /**
     * @param statusToUpdate The update status of an ingress endpoint.
     */
    public fun statusToUpdate(statusToUpdate: String)

    /**
     * @param tags The tags used to organize, track, or control access for the resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags used to organize, track, or control access for the resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param trafficPolicyId The identifier of an existing traffic policy that you attach to an
     * ingress endpoint resource. 
     */
    public fun trafficPolicyId(trafficPolicyId: String)

    /**
     * @param type The type of the ingress endpoint to create. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ses.CfnMailManagerIngressPointProps.Builder =
        software.amazon.awscdk.services.ses.CfnMailManagerIngressPointProps.builder()

    /**
     * @param ingressPointConfiguration The configuration of the ingress endpoint resource.
     */
    override fun ingressPointConfiguration(ingressPointConfiguration: IResolvable) {
      cdkBuilder.ingressPointConfiguration(ingressPointConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param ingressPointConfiguration The configuration of the ingress endpoint resource.
     */
    override
        fun ingressPointConfiguration(ingressPointConfiguration: CfnMailManagerIngressPoint.IngressPointConfigurationProperty) {
      cdkBuilder.ingressPointConfiguration(ingressPointConfiguration.let(CfnMailManagerIngressPoint.IngressPointConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param ingressPointConfiguration The configuration of the ingress endpoint resource.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dd7028c0f76d8507d34d6ebc4d5ffbc82e9ecad31b1ae8c55e1c95c6bb3aea47")
    override
        fun ingressPointConfiguration(ingressPointConfiguration: CfnMailManagerIngressPoint.IngressPointConfigurationProperty.Builder.() -> Unit):
        Unit =
        ingressPointConfiguration(CfnMailManagerIngressPoint.IngressPointConfigurationProperty(ingressPointConfiguration))

    /**
     * @param ingressPointName A user friendly name for an ingress endpoint resource.
     */
    override fun ingressPointName(ingressPointName: String) {
      cdkBuilder.ingressPointName(ingressPointName)
    }

    /**
     * @param ruleSetId The identifier of an existing rule set that you attach to an ingress
     * endpoint resource. 
     */
    override fun ruleSetId(ruleSetId: String) {
      cdkBuilder.ruleSetId(ruleSetId)
    }

    /**
     * @param statusToUpdate The update status of an ingress endpoint.
     */
    override fun statusToUpdate(statusToUpdate: String) {
      cdkBuilder.statusToUpdate(statusToUpdate)
    }

    /**
     * @param tags The tags used to organize, track, or control access for the resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags used to organize, track, or control access for the resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param trafficPolicyId The identifier of an existing traffic policy that you attach to an
     * ingress endpoint resource. 
     */
    override fun trafficPolicyId(trafficPolicyId: String) {
      cdkBuilder.trafficPolicyId(trafficPolicyId)
    }

    /**
     * @param type The type of the ingress endpoint to create. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.ses.CfnMailManagerIngressPointProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerIngressPointProps,
  ) : CdkObject(cdkObject),
      CfnMailManagerIngressPointProps {
    /**
     * The configuration of the ingress endpoint resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageringresspoint.html#cfn-ses-mailmanageringresspoint-ingresspointconfiguration)
     */
    override fun ingressPointConfiguration(): Any? = unwrap(this).getIngressPointConfiguration()

    /**
     * A user friendly name for an ingress endpoint resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageringresspoint.html#cfn-ses-mailmanageringresspoint-ingresspointname)
     */
    override fun ingressPointName(): String? = unwrap(this).getIngressPointName()

    /**
     * The identifier of an existing rule set that you attach to an ingress endpoint resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageringresspoint.html#cfn-ses-mailmanageringresspoint-rulesetid)
     */
    override fun ruleSetId(): String = unwrap(this).getRuleSetId()

    /**
     * The update status of an ingress endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageringresspoint.html#cfn-ses-mailmanageringresspoint-statustoupdate)
     */
    override fun statusToUpdate(): String? = unwrap(this).getStatusToUpdate()

    /**
     * The tags used to organize, track, or control access for the resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageringresspoint.html#cfn-ses-mailmanageringresspoint-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The identifier of an existing traffic policy that you attach to an ingress endpoint resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageringresspoint.html#cfn-ses-mailmanageringresspoint-trafficpolicyid)
     */
    override fun trafficPolicyId(): String = unwrap(this).getTrafficPolicyId()

    /**
     * The type of the ingress endpoint to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageringresspoint.html#cfn-ses-mailmanageringresspoint-type)
     */
    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMailManagerIngressPointProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerIngressPointProps):
        CfnMailManagerIngressPointProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnMailManagerIngressPointProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMailManagerIngressPointProps):
        software.amazon.awscdk.services.ses.CfnMailManagerIngressPointProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ses.CfnMailManagerIngressPointProps
  }
}
