@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnMLTransform
import software.constructs.Construct

@CdkDslMarker
public class CfnMLTransformDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnMLTransform.Builder = CfnMLTransform.Builder.create(scope, id)

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun glueVersion(glueVersion: String) {
    cdkBuilder.glueVersion(glueVersion)
  }

  public fun inputRecordTables(inputRecordTables: IResolvable) {
    cdkBuilder.inputRecordTables(inputRecordTables)
  }

  public fun inputRecordTables(inputRecordTables: CfnMLTransform.InputRecordTablesProperty) {
    cdkBuilder.inputRecordTables(inputRecordTables)
  }

  public fun maxCapacity(maxCapacity: Number) {
    cdkBuilder.maxCapacity(maxCapacity)
  }

  public fun maxRetries(maxRetries: Number) {
    cdkBuilder.maxRetries(maxRetries)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun numberOfWorkers(numberOfWorkers: Number) {
    cdkBuilder.numberOfWorkers(numberOfWorkers)
  }

  public fun role(role: String) {
    cdkBuilder.role(role)
  }

  public fun tags(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.tags(builder.map)
  }

  public fun tags(tags: Any) {
    cdkBuilder.tags(tags)
  }

  public fun timeout(timeout: Number) {
    cdkBuilder.timeout(timeout)
  }

  public fun transformEncryption(transformEncryption: IResolvable) {
    cdkBuilder.transformEncryption(transformEncryption)
  }

  public fun transformEncryption(transformEncryption: CfnMLTransform.TransformEncryptionProperty) {
    cdkBuilder.transformEncryption(transformEncryption)
  }

  public fun transformParameters(transformParameters: IResolvable) {
    cdkBuilder.transformParameters(transformParameters)
  }

  public fun transformParameters(transformParameters: CfnMLTransform.TransformParametersProperty) {
    cdkBuilder.transformParameters(transformParameters)
  }

  public fun workerType(workerType: String) {
    cdkBuilder.workerType(workerType)
  }

  public fun build(): CfnMLTransform = cdkBuilder.build()
}
