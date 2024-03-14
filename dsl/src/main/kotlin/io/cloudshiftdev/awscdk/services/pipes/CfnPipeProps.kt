package io.cloudshiftdev.awscdk.services.pipes

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnPipeProps {
  /**
   * A description of the pipe.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The state the pipe should be in.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-desiredstate)
   */
  public fun desiredState(): String? = unwrap(this).getDesiredState()

  /**
   * The ARN of the enrichment resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-enrichment)
   */
  public fun enrichment(): String? = unwrap(this).getEnrichment()

  /**
   * The parameters required to set up enrichment on your pipe.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-enrichmentparameters)
   */
  public fun enrichmentParameters(): Any? = unwrap(this).getEnrichmentParameters()

  /**
   * The logging configuration settings for the pipe.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-logconfiguration)
   */
  public fun logConfiguration(): Any? = unwrap(this).getLogConfiguration()

  /**
   * The name of the pipe.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The ARN of the role that allows the pipe to send data to the target.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-rolearn)
   */
  public fun roleArn(): String

  /**
   * The ARN of the source resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-source)
   */
  public fun source(): String

  /**
   * The parameters required to set up a source for your pipe.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-sourceparameters)
   */
  public fun sourceParameters(): Any? = unwrap(this).getSourceParameters()

  /**
   * The list of key-value pairs to associate with the pipe.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * The ARN of the target resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-target)
   */
  public fun target(): String

  /**
   * The parameters required to set up a target for your pipe.
   *
   * For more information about pipe target parameters, including how to use dynamic path
   * parameters, see [Target
   * parameters](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes-event-target.html)
   * in the *Amazon EventBridge User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-targetparameters)
   */
  public fun targetParameters(): Any? = unwrap(this).getTargetParameters()

  /**
   * A builder for [CfnPipeProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A description of the pipe.
     */
    public fun description(description: String)

    /**
     * @param desiredState The state the pipe should be in.
     */
    public fun desiredState(desiredState: String)

    /**
     * @param enrichment The ARN of the enrichment resource.
     */
    public fun enrichment(enrichment: String)

    /**
     * @param enrichmentParameters The parameters required to set up enrichment on your pipe.
     */
    public fun enrichmentParameters(enrichmentParameters: IResolvable)

    /**
     * @param enrichmentParameters The parameters required to set up enrichment on your pipe.
     */
    public fun enrichmentParameters(enrichmentParameters: CfnPipe.PipeEnrichmentParametersProperty)

    /**
     * @param enrichmentParameters The parameters required to set up enrichment on your pipe.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0297dbc28c3ba5edc57c9c34d955342e189ad447fcd53049c41e0c325b322e2c")
    public
        fun enrichmentParameters(enrichmentParameters: CfnPipe.PipeEnrichmentParametersProperty.Builder.() -> Unit)

    /**
     * @param logConfiguration The logging configuration settings for the pipe.
     */
    public fun logConfiguration(logConfiguration: IResolvable)

    /**
     * @param logConfiguration The logging configuration settings for the pipe.
     */
    public fun logConfiguration(logConfiguration: CfnPipe.PipeLogConfigurationProperty)

    /**
     * @param logConfiguration The logging configuration settings for the pipe.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("47e39c8c42f658449b16a7a691395f7df0fed95faac8c4dc2f73b036ab28a331")
    public
        fun logConfiguration(logConfiguration: CfnPipe.PipeLogConfigurationProperty.Builder.() -> Unit)

    /**
     * @param name The name of the pipe.
     */
    public fun name(name: String)

    /**
     * @param roleArn The ARN of the role that allows the pipe to send data to the target. 
     */
    public fun roleArn(roleArn: String)

    /**
     * @param source The ARN of the source resource. 
     */
    public fun source(source: String)

    /**
     * @param sourceParameters The parameters required to set up a source for your pipe.
     */
    public fun sourceParameters(sourceParameters: IResolvable)

    /**
     * @param sourceParameters The parameters required to set up a source for your pipe.
     */
    public fun sourceParameters(sourceParameters: CfnPipe.PipeSourceParametersProperty)

    /**
     * @param sourceParameters The parameters required to set up a source for your pipe.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("127357ee001057628f36fb31fb5274eca0eb5973a09b313a9e78465424f0cd8f")
    public
        fun sourceParameters(sourceParameters: CfnPipe.PipeSourceParametersProperty.Builder.() -> Unit)

    /**
     * @param tags The list of key-value pairs to associate with the pipe.
     */
    public fun tags(tags: Map<String, String>)

    /**
     * @param target The ARN of the target resource. 
     */
    public fun target(target: String)

    /**
     * @param targetParameters The parameters required to set up a target for your pipe.
     * For more information about pipe target parameters, including how to use dynamic path
     * parameters, see [Target
     * parameters](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes-event-target.html)
     * in the *Amazon EventBridge User Guide* .
     */
    public fun targetParameters(targetParameters: IResolvable)

    /**
     * @param targetParameters The parameters required to set up a target for your pipe.
     * For more information about pipe target parameters, including how to use dynamic path
     * parameters, see [Target
     * parameters](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes-event-target.html)
     * in the *Amazon EventBridge User Guide* .
     */
    public fun targetParameters(targetParameters: CfnPipe.PipeTargetParametersProperty)

    /**
     * @param targetParameters The parameters required to set up a target for your pipe.
     * For more information about pipe target parameters, including how to use dynamic path
     * parameters, see [Target
     * parameters](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes-event-target.html)
     * in the *Amazon EventBridge User Guide* .
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dd711d2029ca2597d1b0f36aacc2891fbc90cd2160955befffd2af1c3c93316f")
    public
        fun targetParameters(targetParameters: CfnPipe.PipeTargetParametersProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pipes.CfnPipeProps.Builder =
        software.amazon.awscdk.services.pipes.CfnPipeProps.builder()

    /**
     * @param description A description of the pipe.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param desiredState The state the pipe should be in.
     */
    override fun desiredState(desiredState: String) {
      cdkBuilder.desiredState(desiredState)
    }

    /**
     * @param enrichment The ARN of the enrichment resource.
     */
    override fun enrichment(enrichment: String) {
      cdkBuilder.enrichment(enrichment)
    }

    /**
     * @param enrichmentParameters The parameters required to set up enrichment on your pipe.
     */
    override fun enrichmentParameters(enrichmentParameters: IResolvable) {
      cdkBuilder.enrichmentParameters(enrichmentParameters.let(IResolvable::unwrap))
    }

    /**
     * @param enrichmentParameters The parameters required to set up enrichment on your pipe.
     */
    override
        fun enrichmentParameters(enrichmentParameters: CfnPipe.PipeEnrichmentParametersProperty) {
      cdkBuilder.enrichmentParameters(enrichmentParameters.let(CfnPipe.PipeEnrichmentParametersProperty::unwrap))
    }

    /**
     * @param enrichmentParameters The parameters required to set up enrichment on your pipe.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0297dbc28c3ba5edc57c9c34d955342e189ad447fcd53049c41e0c325b322e2c")
    override
        fun enrichmentParameters(enrichmentParameters: CfnPipe.PipeEnrichmentParametersProperty.Builder.() -> Unit):
        Unit = enrichmentParameters(CfnPipe.PipeEnrichmentParametersProperty(enrichmentParameters))

    /**
     * @param logConfiguration The logging configuration settings for the pipe.
     */
    override fun logConfiguration(logConfiguration: IResolvable) {
      cdkBuilder.logConfiguration(logConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param logConfiguration The logging configuration settings for the pipe.
     */
    override fun logConfiguration(logConfiguration: CfnPipe.PipeLogConfigurationProperty) {
      cdkBuilder.logConfiguration(logConfiguration.let(CfnPipe.PipeLogConfigurationProperty::unwrap))
    }

    /**
     * @param logConfiguration The logging configuration settings for the pipe.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("47e39c8c42f658449b16a7a691395f7df0fed95faac8c4dc2f73b036ab28a331")
    override
        fun logConfiguration(logConfiguration: CfnPipe.PipeLogConfigurationProperty.Builder.() -> Unit):
        Unit = logConfiguration(CfnPipe.PipeLogConfigurationProperty(logConfiguration))

    /**
     * @param name The name of the pipe.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param roleArn The ARN of the role that allows the pipe to send data to the target. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param source The ARN of the source resource. 
     */
    override fun source(source: String) {
      cdkBuilder.source(source)
    }

    /**
     * @param sourceParameters The parameters required to set up a source for your pipe.
     */
    override fun sourceParameters(sourceParameters: IResolvable) {
      cdkBuilder.sourceParameters(sourceParameters.let(IResolvable::unwrap))
    }

    /**
     * @param sourceParameters The parameters required to set up a source for your pipe.
     */
    override fun sourceParameters(sourceParameters: CfnPipe.PipeSourceParametersProperty) {
      cdkBuilder.sourceParameters(sourceParameters.let(CfnPipe.PipeSourceParametersProperty::unwrap))
    }

    /**
     * @param sourceParameters The parameters required to set up a source for your pipe.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("127357ee001057628f36fb31fb5274eca0eb5973a09b313a9e78465424f0cd8f")
    override
        fun sourceParameters(sourceParameters: CfnPipe.PipeSourceParametersProperty.Builder.() -> Unit):
        Unit = sourceParameters(CfnPipe.PipeSourceParametersProperty(sourceParameters))

    /**
     * @param tags The list of key-value pairs to associate with the pipe.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param target The ARN of the target resource. 
     */
    override fun target(target: String) {
      cdkBuilder.target(target)
    }

    /**
     * @param targetParameters The parameters required to set up a target for your pipe.
     * For more information about pipe target parameters, including how to use dynamic path
     * parameters, see [Target
     * parameters](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes-event-target.html)
     * in the *Amazon EventBridge User Guide* .
     */
    override fun targetParameters(targetParameters: IResolvable) {
      cdkBuilder.targetParameters(targetParameters.let(IResolvable::unwrap))
    }

    /**
     * @param targetParameters The parameters required to set up a target for your pipe.
     * For more information about pipe target parameters, including how to use dynamic path
     * parameters, see [Target
     * parameters](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes-event-target.html)
     * in the *Amazon EventBridge User Guide* .
     */
    override fun targetParameters(targetParameters: CfnPipe.PipeTargetParametersProperty) {
      cdkBuilder.targetParameters(targetParameters.let(CfnPipe.PipeTargetParametersProperty::unwrap))
    }

    /**
     * @param targetParameters The parameters required to set up a target for your pipe.
     * For more information about pipe target parameters, including how to use dynamic path
     * parameters, see [Target
     * parameters](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes-event-target.html)
     * in the *Amazon EventBridge User Guide* .
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dd711d2029ca2597d1b0f36aacc2891fbc90cd2160955befffd2af1c3c93316f")
    override
        fun targetParameters(targetParameters: CfnPipe.PipeTargetParametersProperty.Builder.() -> Unit):
        Unit = targetParameters(CfnPipe.PipeTargetParametersProperty(targetParameters))

    public fun build(): software.amazon.awscdk.services.pipes.CfnPipeProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.pipes.CfnPipeProps,
  ) : CdkObject(cdkObject), CfnPipeProps {
    /**
     * A description of the pipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The state the pipe should be in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-desiredstate)
     */
    override fun desiredState(): String? = unwrap(this).getDesiredState()

    /**
     * The ARN of the enrichment resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-enrichment)
     */
    override fun enrichment(): String? = unwrap(this).getEnrichment()

    /**
     * The parameters required to set up enrichment on your pipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-enrichmentparameters)
     */
    override fun enrichmentParameters(): Any? = unwrap(this).getEnrichmentParameters()

    /**
     * The logging configuration settings for the pipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-logconfiguration)
     */
    override fun logConfiguration(): Any? = unwrap(this).getLogConfiguration()

    /**
     * The name of the pipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The ARN of the role that allows the pipe to send data to the target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-rolearn)
     */
    override fun roleArn(): String = unwrap(this).getRoleArn()

    /**
     * The ARN of the source resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-source)
     */
    override fun source(): String = unwrap(this).getSource()

    /**
     * The parameters required to set up a source for your pipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-sourceparameters)
     */
    override fun sourceParameters(): Any? = unwrap(this).getSourceParameters()

    /**
     * The list of key-value pairs to associate with the pipe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    /**
     * The ARN of the target resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-target)
     */
    override fun target(): String = unwrap(this).getTarget()

    /**
     * The parameters required to set up a target for your pipe.
     *
     * For more information about pipe target parameters, including how to use dynamic path
     * parameters, see [Target
     * parameters](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes-event-target.html)
     * in the *Amazon EventBridge User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-targetparameters)
     */
    override fun targetParameters(): Any? = unwrap(this).getTargetParameters()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPipeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pipes.CfnPipeProps): CfnPipeProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPipeProps): software.amazon.awscdk.services.pipes.CfnPipeProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.pipes.CfnPipeProps
  }
}
