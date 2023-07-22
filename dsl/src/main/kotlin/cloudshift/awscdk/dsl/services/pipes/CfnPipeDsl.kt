@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pipes.CfnPipe
import software.constructs.Construct

@CdkDslMarker
public class CfnPipeDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnPipe.Builder = CfnPipe.Builder.create(scope, id)

  /**
   * A description of the pipe.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-description)
   * @param description A description of the pipe. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The state the pipe should be in.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-desiredstate)
   * @param desiredState The state the pipe should be in. 
   */
  public fun desiredState(desiredState: String) {
    cdkBuilder.desiredState(desiredState)
  }

  /**
   * The ARN of the enrichment resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-enrichment)
   * @param enrichment The ARN of the enrichment resource. 
   */
  public fun enrichment(enrichment: String) {
    cdkBuilder.enrichment(enrichment)
  }

  /**
   * The parameters required to set up enrichment on your pipe.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-enrichmentparameters)
   * @param enrichmentParameters The parameters required to set up enrichment on your pipe. 
   */
  public fun enrichmentParameters(enrichmentParameters: IResolvable) {
    cdkBuilder.enrichmentParameters(enrichmentParameters)
  }

  /**
   * The parameters required to set up enrichment on your pipe.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-enrichmentparameters)
   * @param enrichmentParameters The parameters required to set up enrichment on your pipe. 
   */
  public fun enrichmentParameters(enrichmentParameters: CfnPipe.PipeEnrichmentParametersProperty) {
    cdkBuilder.enrichmentParameters(enrichmentParameters)
  }

  /**
   * The name of the pipe.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-name)
   * @param name The name of the pipe. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The ARN of the role that allows the pipe to send data to the target.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-rolearn)
   * @param roleArn The ARN of the role that allows the pipe to send data to the target. 
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  /**
   * The ARN of the source resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-source)
   * @param source The ARN of the source resource. 
   */
  public fun source(source: String) {
    cdkBuilder.source(source)
  }

  /**
   * The parameters required to set up a source for your pipe.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-sourceparameters)
   * @param sourceParameters The parameters required to set up a source for your pipe. 
   */
  public fun sourceParameters(sourceParameters: IResolvable) {
    cdkBuilder.sourceParameters(sourceParameters)
  }

  /**
   * The parameters required to set up a source for your pipe.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-sourceparameters)
   * @param sourceParameters The parameters required to set up a source for your pipe. 
   */
  public fun sourceParameters(sourceParameters: CfnPipe.PipeSourceParametersProperty) {
    cdkBuilder.sourceParameters(sourceParameters)
  }

  /**
   * The list of key-value pairs to associate with the pipe.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-tags)
   * @param tags The list of key-value pairs to associate with the pipe. 
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  /**
   * The ARN of the target resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-target)
   * @param target The ARN of the target resource. 
   */
  public fun target(target: String) {
    cdkBuilder.target(target)
  }

  /**
   * The parameters required to set up a target for your pipe.
   *
   * For more information about pipe target parameters, including how to use dynamic path
   * parameters, see [Target
   * parameters](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes-event-target.html)
   * in the *Amazon EventBridge User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-targetparameters)
   * @param targetParameters The parameters required to set up a target for your pipe. 
   */
  public fun targetParameters(targetParameters: IResolvable) {
    cdkBuilder.targetParameters(targetParameters)
  }

  /**
   * The parameters required to set up a target for your pipe.
   *
   * For more information about pipe target parameters, including how to use dynamic path
   * parameters, see [Target
   * parameters](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes-event-target.html)
   * in the *Amazon EventBridge User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pipes-pipe.html#cfn-pipes-pipe-targetparameters)
   * @param targetParameters The parameters required to set up a target for your pipe. 
   */
  public fun targetParameters(targetParameters: CfnPipe.PipeTargetParametersProperty) {
    cdkBuilder.targetParameters(targetParameters)
  }

  public fun build(): CfnPipe = cdkBuilder.build()
}
