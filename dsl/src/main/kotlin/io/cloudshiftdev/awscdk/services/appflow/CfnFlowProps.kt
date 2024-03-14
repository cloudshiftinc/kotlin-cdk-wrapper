package io.cloudshiftdev.awscdk.services.appflow

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnFlowProps {
  /**
   * A user-entered description of the flow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The configuration that controls how Amazon AppFlow places data in the destination connector.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-destinationflowconfiglist)
   */
  public fun destinationFlowConfigList(): Any

  /**
   * The specified name of the flow.
   *
   * Spaces are not allowed. Use underscores (_) or hyphens (-) only.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-flowname)
   */
  public fun flowName(): String

  /**
   * Sets the status of the flow. You can specify one of the following values:.
   *
   * * **Active** - The flow runs based on the trigger settings that you defined. Active scheduled
   * flows run as scheduled, and active event-triggered flows run when the specified change event
   * occurs. However, active on-demand flows run only when you manually start them by using Amazon
   * AppFlow.
   * * **Suspended** - You can use this option to deactivate an active flow. Scheduled and
   * event-triggered flows will cease to run until you reactive them. This value only affects scheduled
   * and event-triggered flows. It has no effect for on-demand flows.
   *
   * If you omit the FlowStatus parameter, Amazon AppFlow creates the flow with a default status.
   * The default status for on-demand flows is Active. The default status for scheduled and
   * event-triggered flows is Draft, which means they’re not yet active.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-flowstatus)
   */
  public fun flowStatus(): String? = unwrap(this).getFlowStatus()

  /**
   * The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for
   * encryption.
   *
   * This is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't
   * provide anything here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-kmsarn)
   */
  public fun kmsArn(): String? = unwrap(this).getKmsArn()

  /**
   * Specifies the configuration that Amazon AppFlow uses when it catalogs your data.
   *
   * When Amazon AppFlow catalogs your data, it stores metadata in a data catalog.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-metadatacatalogconfig)
   */
  public fun metadataCatalogConfig(): Any? = unwrap(this).getMetadataCatalogConfig()

  /**
   * Contains information about the configuration of the source connector used in the flow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-sourceflowconfig)
   */
  public fun sourceFlowConfig(): Any

  /**
   * The tags used to organize, track, or control access for your flow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A list of tasks that Amazon AppFlow performs while transferring the data in the flow run.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-tasks)
   */
  public fun tasks(): Any

  /**
   * The trigger settings that determine how and when Amazon AppFlow runs the specified flow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-triggerconfig)
   */
  public fun triggerConfig(): Any

  /**
   * A builder for [CfnFlowProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A user-entered description of the flow.
     */
    public fun description(description: String)

    /**
     * @param destinationFlowConfigList The configuration that controls how Amazon AppFlow places
     * data in the destination connector. 
     */
    public fun destinationFlowConfigList(destinationFlowConfigList: IResolvable)

    /**
     * @param destinationFlowConfigList The configuration that controls how Amazon AppFlow places
     * data in the destination connector. 
     */
    public fun destinationFlowConfigList(destinationFlowConfigList: List<Any>)

    /**
     * @param destinationFlowConfigList The configuration that controls how Amazon AppFlow places
     * data in the destination connector. 
     */
    public fun destinationFlowConfigList(vararg destinationFlowConfigList: Any)

    /**
     * @param flowName The specified name of the flow. 
     * Spaces are not allowed. Use underscores (_) or hyphens (-) only.
     */
    public fun flowName(flowName: String)

    /**
     * @param flowStatus Sets the status of the flow. You can specify one of the following values:.
     * * **Active** - The flow runs based on the trigger settings that you defined. Active scheduled
     * flows run as scheduled, and active event-triggered flows run when the specified change event
     * occurs. However, active on-demand flows run only when you manually start them by using Amazon
     * AppFlow.
     * * **Suspended** - You can use this option to deactivate an active flow. Scheduled and
     * event-triggered flows will cease to run until you reactive them. This value only affects
     * scheduled and event-triggered flows. It has no effect for on-demand flows.
     *
     * If you omit the FlowStatus parameter, Amazon AppFlow creates the flow with a default status.
     * The default status for on-demand flows is Active. The default status for scheduled and
     * event-triggered flows is Draft, which means they’re not yet active.
     */
    public fun flowStatus(flowStatus: String)

    /**
     * @param kmsArn The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you
     * provide for encryption.
     * This is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't
     * provide anything here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key.
     */
    public fun kmsArn(kmsArn: String)

    /**
     * @param metadataCatalogConfig Specifies the configuration that Amazon AppFlow uses when it
     * catalogs your data.
     * When Amazon AppFlow catalogs your data, it stores metadata in a data catalog.
     */
    public fun metadataCatalogConfig(metadataCatalogConfig: IResolvable)

    /**
     * @param metadataCatalogConfig Specifies the configuration that Amazon AppFlow uses when it
     * catalogs your data.
     * When Amazon AppFlow catalogs your data, it stores metadata in a data catalog.
     */
    public fun metadataCatalogConfig(metadataCatalogConfig: CfnFlow.MetadataCatalogConfigProperty)

    /**
     * @param metadataCatalogConfig Specifies the configuration that Amazon AppFlow uses when it
     * catalogs your data.
     * When Amazon AppFlow catalogs your data, it stores metadata in a data catalog.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b73fcfdcd7a024c30a67ebb7555d5657b3b22e689ab0a794d78e09061cfed923")
    public
        fun metadataCatalogConfig(metadataCatalogConfig: CfnFlow.MetadataCatalogConfigProperty.Builder.() -> Unit)

    /**
     * @param sourceFlowConfig Contains information about the configuration of the source connector
     * used in the flow. 
     */
    public fun sourceFlowConfig(sourceFlowConfig: IResolvable)

    /**
     * @param sourceFlowConfig Contains information about the configuration of the source connector
     * used in the flow. 
     */
    public fun sourceFlowConfig(sourceFlowConfig: CfnFlow.SourceFlowConfigProperty)

    /**
     * @param sourceFlowConfig Contains information about the configuration of the source connector
     * used in the flow. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("da5ac7fda3f9ee0d02b4fd08480b1ef093c9a5893fbb784a09a24ccc61354bba")
    public
        fun sourceFlowConfig(sourceFlowConfig: CfnFlow.SourceFlowConfigProperty.Builder.() -> Unit)

    /**
     * @param tags The tags used to organize, track, or control access for your flow.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags used to organize, track, or control access for your flow.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param tasks A list of tasks that Amazon AppFlow performs while transferring the data in the
     * flow run. 
     */
    public fun tasks(tasks: IResolvable)

    /**
     * @param tasks A list of tasks that Amazon AppFlow performs while transferring the data in the
     * flow run. 
     */
    public fun tasks(tasks: List<Any>)

    /**
     * @param tasks A list of tasks that Amazon AppFlow performs while transferring the data in the
     * flow run. 
     */
    public fun tasks(vararg tasks: Any)

    /**
     * @param triggerConfig The trigger settings that determine how and when Amazon AppFlow runs the
     * specified flow. 
     */
    public fun triggerConfig(triggerConfig: IResolvable)

    /**
     * @param triggerConfig The trigger settings that determine how and when Amazon AppFlow runs the
     * specified flow. 
     */
    public fun triggerConfig(triggerConfig: CfnFlow.TriggerConfigProperty)

    /**
     * @param triggerConfig The trigger settings that determine how and when Amazon AppFlow runs the
     * specified flow. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7a6f7b25b6dc6f9cb11463694b3f50397b41edd91e4387201caaf4d3f7563f69")
    public fun triggerConfig(triggerConfig: CfnFlow.TriggerConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appflow.CfnFlowProps.Builder =
        software.amazon.awscdk.services.appflow.CfnFlowProps.builder()

    /**
     * @param description A user-entered description of the flow.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param destinationFlowConfigList The configuration that controls how Amazon AppFlow places
     * data in the destination connector. 
     */
    override fun destinationFlowConfigList(destinationFlowConfigList: IResolvable) {
      cdkBuilder.destinationFlowConfigList(destinationFlowConfigList.let(IResolvable::unwrap))
    }

    /**
     * @param destinationFlowConfigList The configuration that controls how Amazon AppFlow places
     * data in the destination connector. 
     */
    override fun destinationFlowConfigList(destinationFlowConfigList: List<Any>) {
      cdkBuilder.destinationFlowConfigList(destinationFlowConfigList)
    }

    /**
     * @param destinationFlowConfigList The configuration that controls how Amazon AppFlow places
     * data in the destination connector. 
     */
    override fun destinationFlowConfigList(vararg destinationFlowConfigList: Any): Unit =
        destinationFlowConfigList(destinationFlowConfigList.toList())

    /**
     * @param flowName The specified name of the flow. 
     * Spaces are not allowed. Use underscores (_) or hyphens (-) only.
     */
    override fun flowName(flowName: String) {
      cdkBuilder.flowName(flowName)
    }

    /**
     * @param flowStatus Sets the status of the flow. You can specify one of the following values:.
     * * **Active** - The flow runs based on the trigger settings that you defined. Active scheduled
     * flows run as scheduled, and active event-triggered flows run when the specified change event
     * occurs. However, active on-demand flows run only when you manually start them by using Amazon
     * AppFlow.
     * * **Suspended** - You can use this option to deactivate an active flow. Scheduled and
     * event-triggered flows will cease to run until you reactive them. This value only affects
     * scheduled and event-triggered flows. It has no effect for on-demand flows.
     *
     * If you omit the FlowStatus parameter, Amazon AppFlow creates the flow with a default status.
     * The default status for on-demand flows is Active. The default status for scheduled and
     * event-triggered flows is Draft, which means they’re not yet active.
     */
    override fun flowStatus(flowStatus: String) {
      cdkBuilder.flowStatus(flowStatus)
    }

    /**
     * @param kmsArn The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you
     * provide for encryption.
     * This is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't
     * provide anything here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key.
     */
    override fun kmsArn(kmsArn: String) {
      cdkBuilder.kmsArn(kmsArn)
    }

    /**
     * @param metadataCatalogConfig Specifies the configuration that Amazon AppFlow uses when it
     * catalogs your data.
     * When Amazon AppFlow catalogs your data, it stores metadata in a data catalog.
     */
    override fun metadataCatalogConfig(metadataCatalogConfig: IResolvable) {
      cdkBuilder.metadataCatalogConfig(metadataCatalogConfig.let(IResolvable::unwrap))
    }

    /**
     * @param metadataCatalogConfig Specifies the configuration that Amazon AppFlow uses when it
     * catalogs your data.
     * When Amazon AppFlow catalogs your data, it stores metadata in a data catalog.
     */
    override
        fun metadataCatalogConfig(metadataCatalogConfig: CfnFlow.MetadataCatalogConfigProperty) {
      cdkBuilder.metadataCatalogConfig(metadataCatalogConfig.let(CfnFlow.MetadataCatalogConfigProperty::unwrap))
    }

    /**
     * @param metadataCatalogConfig Specifies the configuration that Amazon AppFlow uses when it
     * catalogs your data.
     * When Amazon AppFlow catalogs your data, it stores metadata in a data catalog.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b73fcfdcd7a024c30a67ebb7555d5657b3b22e689ab0a794d78e09061cfed923")
    override
        fun metadataCatalogConfig(metadataCatalogConfig: CfnFlow.MetadataCatalogConfigProperty.Builder.() -> Unit):
        Unit = metadataCatalogConfig(CfnFlow.MetadataCatalogConfigProperty(metadataCatalogConfig))

    /**
     * @param sourceFlowConfig Contains information about the configuration of the source connector
     * used in the flow. 
     */
    override fun sourceFlowConfig(sourceFlowConfig: IResolvable) {
      cdkBuilder.sourceFlowConfig(sourceFlowConfig.let(IResolvable::unwrap))
    }

    /**
     * @param sourceFlowConfig Contains information about the configuration of the source connector
     * used in the flow. 
     */
    override fun sourceFlowConfig(sourceFlowConfig: CfnFlow.SourceFlowConfigProperty) {
      cdkBuilder.sourceFlowConfig(sourceFlowConfig.let(CfnFlow.SourceFlowConfigProperty::unwrap))
    }

    /**
     * @param sourceFlowConfig Contains information about the configuration of the source connector
     * used in the flow. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("da5ac7fda3f9ee0d02b4fd08480b1ef093c9a5893fbb784a09a24ccc61354bba")
    override
        fun sourceFlowConfig(sourceFlowConfig: CfnFlow.SourceFlowConfigProperty.Builder.() -> Unit):
        Unit = sourceFlowConfig(CfnFlow.SourceFlowConfigProperty(sourceFlowConfig))

    /**
     * @param tags The tags used to organize, track, or control access for your flow.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags used to organize, track, or control access for your flow.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param tasks A list of tasks that Amazon AppFlow performs while transferring the data in the
     * flow run. 
     */
    override fun tasks(tasks: IResolvable) {
      cdkBuilder.tasks(tasks.let(IResolvable::unwrap))
    }

    /**
     * @param tasks A list of tasks that Amazon AppFlow performs while transferring the data in the
     * flow run. 
     */
    override fun tasks(tasks: List<Any>) {
      cdkBuilder.tasks(tasks)
    }

    /**
     * @param tasks A list of tasks that Amazon AppFlow performs while transferring the data in the
     * flow run. 
     */
    override fun tasks(vararg tasks: Any): Unit = tasks(tasks.toList())

    /**
     * @param triggerConfig The trigger settings that determine how and when Amazon AppFlow runs the
     * specified flow. 
     */
    override fun triggerConfig(triggerConfig: IResolvable) {
      cdkBuilder.triggerConfig(triggerConfig.let(IResolvable::unwrap))
    }

    /**
     * @param triggerConfig The trigger settings that determine how and when Amazon AppFlow runs the
     * specified flow. 
     */
    override fun triggerConfig(triggerConfig: CfnFlow.TriggerConfigProperty) {
      cdkBuilder.triggerConfig(triggerConfig.let(CfnFlow.TriggerConfigProperty::unwrap))
    }

    /**
     * @param triggerConfig The trigger settings that determine how and when Amazon AppFlow runs the
     * specified flow. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7a6f7b25b6dc6f9cb11463694b3f50397b41edd91e4387201caaf4d3f7563f69")
    override fun triggerConfig(triggerConfig: CfnFlow.TriggerConfigProperty.Builder.() -> Unit):
        Unit = triggerConfig(CfnFlow.TriggerConfigProperty(triggerConfig))

    public fun build(): software.amazon.awscdk.services.appflow.CfnFlowProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appflow.CfnFlowProps,
  ) : CdkObject(cdkObject), CfnFlowProps {
    /**
     * A user-entered description of the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The configuration that controls how Amazon AppFlow places data in the destination connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-destinationflowconfiglist)
     */
    override fun destinationFlowConfigList(): Any = unwrap(this).getDestinationFlowConfigList()

    /**
     * The specified name of the flow.
     *
     * Spaces are not allowed. Use underscores (_) or hyphens (-) only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-flowname)
     */
    override fun flowName(): String = unwrap(this).getFlowName()

    /**
     * Sets the status of the flow. You can specify one of the following values:.
     *
     * * **Active** - The flow runs based on the trigger settings that you defined. Active scheduled
     * flows run as scheduled, and active event-triggered flows run when the specified change event
     * occurs. However, active on-demand flows run only when you manually start them by using Amazon
     * AppFlow.
     * * **Suspended** - You can use this option to deactivate an active flow. Scheduled and
     * event-triggered flows will cease to run until you reactive them. This value only affects
     * scheduled and event-triggered flows. It has no effect for on-demand flows.
     *
     * If you omit the FlowStatus parameter, Amazon AppFlow creates the flow with a default status.
     * The default status for on-demand flows is Active. The default status for scheduled and
     * event-triggered flows is Draft, which means they’re not yet active.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-flowstatus)
     */
    override fun flowStatus(): String? = unwrap(this).getFlowStatus()

    /**
     * The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for
     * encryption.
     *
     * This is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't
     * provide anything here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-kmsarn)
     */
    override fun kmsArn(): String? = unwrap(this).getKmsArn()

    /**
     * Specifies the configuration that Amazon AppFlow uses when it catalogs your data.
     *
     * When Amazon AppFlow catalogs your data, it stores metadata in a data catalog.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-metadatacatalogconfig)
     */
    override fun metadataCatalogConfig(): Any? = unwrap(this).getMetadataCatalogConfig()

    /**
     * Contains information about the configuration of the source connector used in the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-sourceflowconfig)
     */
    override fun sourceFlowConfig(): Any = unwrap(this).getSourceFlowConfig()

    /**
     * The tags used to organize, track, or control access for your flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * A list of tasks that Amazon AppFlow performs while transferring the data in the flow run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-tasks)
     */
    override fun tasks(): Any = unwrap(this).getTasks()

    /**
     * The trigger settings that determine how and when Amazon AppFlow runs the specified flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-flow.html#cfn-appflow-flow-triggerconfig)
     */
    override fun triggerConfig(): Any = unwrap(this).getTriggerConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFlowProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnFlowProps): CfnFlowProps
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFlowProps): software.amazon.awscdk.services.appflow.CfnFlowProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.appflow.CfnFlowProps
  }
}
