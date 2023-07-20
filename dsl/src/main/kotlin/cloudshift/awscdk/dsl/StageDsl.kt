@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Environment
import software.amazon.awscdk.IPolicyValidationPluginBeta1
import software.amazon.awscdk.PermissionsBoundary
import software.amazon.awscdk.Stage
import software.constructs.Construct

@CdkDslMarker
public class StageDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: Stage.Builder = Stage.Builder.create(scope, id)

  private val _policyValidationBeta1: MutableList<IPolicyValidationPluginBeta1> = mutableListOf()

  public fun env(block: EnvironmentDsl.() -> Unit = {}) {
    val builder = EnvironmentDsl()
    builder.apply(block)
    cdkBuilder.env(builder.build())
  }

  public fun env(env: Environment) {
    cdkBuilder.env(env)
  }

  public fun outdir(outdir: String) {
    cdkBuilder.outdir(outdir)
  }

  public fun permissionsBoundary(permissionsBoundary: PermissionsBoundary) {
    cdkBuilder.permissionsBoundary(permissionsBoundary)
  }

  public fun policyValidationBeta1(vararg policyValidationBeta1: IPolicyValidationPluginBeta1) {
    _policyValidationBeta1.addAll(listOf(*policyValidationBeta1))
  }

  public
      fun policyValidationBeta1(policyValidationBeta1: Collection<IPolicyValidationPluginBeta1>) {
    _policyValidationBeta1.addAll(policyValidationBeta1)
  }

  public fun stageName(stageName: String) {
    cdkBuilder.stageName(stageName)
  }

  public fun build(): Stage {
    if(_policyValidationBeta1.isNotEmpty()) cdkBuilder.policyValidationBeta1(_policyValidationBeta1)
    return cdkBuilder.build()
  }
}
