@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.sam.CfnFunction

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * ImageConfigProperty imageConfigProperty = ImageConfigProperty.builder()
 * .command(List.of("command"))
 * .entryPoint(List.of("entryPoint"))
 * .workingDirectory("workingDirectory")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-imageconfig.html)
 */
@CdkDslMarker
public class CfnFunctionImageConfigPropertyDsl {
  private val cdkBuilder: CfnFunction.ImageConfigProperty.Builder =
      CfnFunction.ImageConfigProperty.builder()

  private val _command: MutableList<String> = mutableListOf()

  private val _entryPoint: MutableList<String> = mutableListOf()

  /**
   * @param command the value to be set.
   */
  public fun command(vararg command: String) {
    _command.addAll(listOf(*command))
  }

  /**
   * @param command the value to be set.
   */
  public fun command(command: Collection<String>) {
    _command.addAll(command)
  }

  /**
   * @param entryPoint the value to be set.
   */
  public fun entryPoint(vararg entryPoint: String) {
    _entryPoint.addAll(listOf(*entryPoint))
  }

  /**
   * @param entryPoint the value to be set.
   */
  public fun entryPoint(entryPoint: Collection<String>) {
    _entryPoint.addAll(entryPoint)
  }

  /**
   * @param workingDirectory the value to be set.
   */
  public fun workingDirectory(workingDirectory: String) {
    cdkBuilder.workingDirectory(workingDirectory)
  }

  public fun build(): CfnFunction.ImageConfigProperty {
    if(_command.isNotEmpty()) cdkBuilder.command(_command)
    if(_entryPoint.isNotEmpty()) cdkBuilder.entryPoint(_entryPoint)
    return cdkBuilder.build()
  }
}
