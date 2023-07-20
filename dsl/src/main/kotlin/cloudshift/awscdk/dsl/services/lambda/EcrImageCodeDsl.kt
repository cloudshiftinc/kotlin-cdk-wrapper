@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Deprecated
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ecr.IRepository
import software.amazon.awscdk.services.lambda.EcrImageCode

@CdkDslMarker
public class EcrImageCodeDsl(
  repository: IRepository,
) {
  private val cdkBuilder: EcrImageCode.Builder = EcrImageCode.Builder.create(repository)

  private val _cmd: MutableList<String> = mutableListOf()

  private val _entrypoint: MutableList<String> = mutableListOf()

  public fun cmd(vararg cmd: String) {
    _cmd.addAll(listOf(*cmd))
  }

  public fun cmd(cmd: Collection<String>) {
    _cmd.addAll(cmd)
  }

  public fun entrypoint(vararg entrypoint: String) {
    _entrypoint.addAll(listOf(*entrypoint))
  }

  public fun entrypoint(entrypoint: Collection<String>) {
    _entrypoint.addAll(entrypoint)
  }

  @Deprecated(message = "deprecated in CDK")
  public fun tag(tag: String) {
    cdkBuilder.tag(tag)
  }

  public fun tagOrDigest(tagOrDigest: String) {
    cdkBuilder.tagOrDigest(tagOrDigest)
  }

  public fun workingDirectory(workingDirectory: String) {
    cdkBuilder.workingDirectory(workingDirectory)
  }

  public fun build(): EcrImageCode {
    if(_cmd.isNotEmpty()) cdkBuilder.cmd(_cmd)
    if(_entrypoint.isNotEmpty()) cdkBuilder.entrypoint(_entrypoint)
    return cdkBuilder.build()
  }
}
