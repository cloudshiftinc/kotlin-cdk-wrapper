@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

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
 * Properties for defining a `CfnQueue`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.connect.*;
 * CfnQueueProps cfnQueueProps = CfnQueueProps.builder()
 * .hoursOfOperationArn("hoursOfOperationArn")
 * .instanceArn("instanceArn")
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .maxContacts(123)
 * .outboundCallerConfig(OutboundCallerConfigProperty.builder()
 * .outboundCallerIdName("outboundCallerIdName")
 * .outboundCallerIdNumberArn("outboundCallerIdNumberArn")
 * .outboundFlowArn("outboundFlowArn")
 * .build())
 * .quickConnectArns(List.of("quickConnectArns"))
 * .status("status")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-queue.html)
 */
public interface CfnQueueProps {
  /**
   * The description of the queue.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-queue.html#cfn-connect-queue-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The Amazon Resource Name (ARN) of the hours of operation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-queue.html#cfn-connect-queue-hoursofoperationarn)
   */
  public fun hoursOfOperationArn(): String

  /**
   * The identifier of the Amazon Connect instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-queue.html#cfn-connect-queue-instancearn)
   */
  public fun instanceArn(): String

  /**
   * The maximum number of contacts that can be in the queue before it is considered full.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-queue.html#cfn-connect-queue-maxcontacts)
   */
  public fun maxContacts(): Number? = unwrap(this).getMaxContacts()

  /**
   * The name of the queue.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-queue.html#cfn-connect-queue-name)
   */
  public fun name(): String

  /**
   * The outbound caller ID name, number, and outbound whisper flow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-queue.html#cfn-connect-queue-outboundcallerconfig)
   */
  public fun outboundCallerConfig(): Any? = unwrap(this).getOutboundCallerConfig()

  /**
   * The Amazon Resource Names (ARN) of the of the quick connects available to agents who are
   * working the queue.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-queue.html#cfn-connect-queue-quickconnectarns)
   */
  public fun quickConnectArns(): List<String> = unwrap(this).getQuickConnectArns() ?: emptyList()

  /**
   * The status of the queue.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-queue.html#cfn-connect-queue-status)
   */
  public fun status(): String? = unwrap(this).getStatus()

  /**
   * The tags used to organize, track, or control access for this resource.
   *
   * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-queue.html#cfn-connect-queue-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnQueueProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the queue.
     */
    public fun description(description: String)

    /**
     * @param hoursOfOperationArn The Amazon Resource Name (ARN) of the hours of operation. 
     */
    public fun hoursOfOperationArn(hoursOfOperationArn: String)

    /**
     * @param instanceArn The identifier of the Amazon Connect instance. 
     */
    public fun instanceArn(instanceArn: String)

    /**
     * @param maxContacts The maximum number of contacts that can be in the queue before it is
     * considered full.
     */
    public fun maxContacts(maxContacts: Number)

    /**
     * @param name The name of the queue. 
     */
    public fun name(name: String)

    /**
     * @param outboundCallerConfig The outbound caller ID name, number, and outbound whisper flow.
     */
    public fun outboundCallerConfig(outboundCallerConfig: IResolvable)

    /**
     * @param outboundCallerConfig The outbound caller ID name, number, and outbound whisper flow.
     */
    public fun outboundCallerConfig(outboundCallerConfig: CfnQueue.OutboundCallerConfigProperty)

    /**
     * @param outboundCallerConfig The outbound caller ID name, number, and outbound whisper flow.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("16880054666c2efa682ec1fe91fbb9db3ee063e4717a75239d9deb55b1db742a")
    public
        fun outboundCallerConfig(outboundCallerConfig: CfnQueue.OutboundCallerConfigProperty.Builder.() -> Unit)

    /**
     * @param quickConnectArns The Amazon Resource Names (ARN) of the of the quick connects
     * available to agents who are working the queue.
     */
    public fun quickConnectArns(quickConnectArns: List<String>)

    /**
     * @param quickConnectArns The Amazon Resource Names (ARN) of the of the quick connects
     * available to agents who are working the queue.
     */
    public fun quickConnectArns(vararg quickConnectArns: String)

    /**
     * @param status The status of the queue.
     */
    public fun status(status: String)

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnQueueProps.Builder =
        software.amazon.awscdk.services.connect.CfnQueueProps.builder()

    /**
     * @param description The description of the queue.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param hoursOfOperationArn The Amazon Resource Name (ARN) of the hours of operation. 
     */
    override fun hoursOfOperationArn(hoursOfOperationArn: String) {
      cdkBuilder.hoursOfOperationArn(hoursOfOperationArn)
    }

    /**
     * @param instanceArn The identifier of the Amazon Connect instance. 
     */
    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    /**
     * @param maxContacts The maximum number of contacts that can be in the queue before it is
     * considered full.
     */
    override fun maxContacts(maxContacts: Number) {
      cdkBuilder.maxContacts(maxContacts)
    }

    /**
     * @param name The name of the queue. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param outboundCallerConfig The outbound caller ID name, number, and outbound whisper flow.
     */
    override fun outboundCallerConfig(outboundCallerConfig: IResolvable) {
      cdkBuilder.outboundCallerConfig(outboundCallerConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param outboundCallerConfig The outbound caller ID name, number, and outbound whisper flow.
     */
    override fun outboundCallerConfig(outboundCallerConfig: CfnQueue.OutboundCallerConfigProperty) {
      cdkBuilder.outboundCallerConfig(outboundCallerConfig.let(CfnQueue.OutboundCallerConfigProperty.Companion::unwrap))
    }

    /**
     * @param outboundCallerConfig The outbound caller ID name, number, and outbound whisper flow.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("16880054666c2efa682ec1fe91fbb9db3ee063e4717a75239d9deb55b1db742a")
    override
        fun outboundCallerConfig(outboundCallerConfig: CfnQueue.OutboundCallerConfigProperty.Builder.() -> Unit):
        Unit = outboundCallerConfig(CfnQueue.OutboundCallerConfigProperty(outboundCallerConfig))

    /**
     * @param quickConnectArns The Amazon Resource Names (ARN) of the of the quick connects
     * available to agents who are working the queue.
     */
    override fun quickConnectArns(quickConnectArns: List<String>) {
      cdkBuilder.quickConnectArns(quickConnectArns)
    }

    /**
     * @param quickConnectArns The Amazon Resource Names (ARN) of the of the quick connects
     * available to agents who are working the queue.
     */
    override fun quickConnectArns(vararg quickConnectArns: String): Unit =
        quickConnectArns(quickConnectArns.toList())

    /**
     * @param status The status of the queue.
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.connect.CfnQueueProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.connect.CfnQueueProps,
  ) : CdkObject(cdkObject), CfnQueueProps {
    /**
     * The description of the queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-queue.html#cfn-connect-queue-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The Amazon Resource Name (ARN) of the hours of operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-queue.html#cfn-connect-queue-hoursofoperationarn)
     */
    override fun hoursOfOperationArn(): String = unwrap(this).getHoursOfOperationArn()

    /**
     * The identifier of the Amazon Connect instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-queue.html#cfn-connect-queue-instancearn)
     */
    override fun instanceArn(): String = unwrap(this).getInstanceArn()

    /**
     * The maximum number of contacts that can be in the queue before it is considered full.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-queue.html#cfn-connect-queue-maxcontacts)
     */
    override fun maxContacts(): Number? = unwrap(this).getMaxContacts()

    /**
     * The name of the queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-queue.html#cfn-connect-queue-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The outbound caller ID name, number, and outbound whisper flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-queue.html#cfn-connect-queue-outboundcallerconfig)
     */
    override fun outboundCallerConfig(): Any? = unwrap(this).getOutboundCallerConfig()

    /**
     * The Amazon Resource Names (ARN) of the of the quick connects available to agents who are
     * working the queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-queue.html#cfn-connect-queue-quickconnectarns)
     */
    override fun quickConnectArns(): List<String> = unwrap(this).getQuickConnectArns() ?:
        emptyList()

    /**
     * The status of the queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-queue.html#cfn-connect-queue-status)
     */
    override fun status(): String? = unwrap(this).getStatus()

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-queue.html#cfn-connect-queue-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnQueueProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnQueueProps):
        CfnQueueProps = CdkObjectWrappers.wrap(cdkObject) as? CfnQueueProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnQueueProps):
        software.amazon.awscdk.services.connect.CfnQueueProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.connect.CfnQueueProps
  }
}
