@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.cxapi.CloudAssembly
import io.cloudshiftdev.constructs.IConstruct
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Stage internal constructor(
  internal override val cdkObject: software.amazon.awscdk.Stage,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  public open fun account(): String? = unwrap(this).getAccount()

  public open fun artifactId(): String = unwrap(this).getArtifactId()

  public open fun assetOutdir(): String = unwrap(this).getAssetOutdir()

  public open fun outdir(): String = unwrap(this).getOutdir()

  public open fun parentStage(): Stage? = unwrap(this).getParentStage()?.let(Stage::wrap)

  public open fun policyValidationBeta1(): List<IPolicyValidationPluginBeta1> =
      unwrap(this).getPolicyValidationBeta1().map(IPolicyValidationPluginBeta1::wrap)

  public open fun region(): String? = unwrap(this).getRegion()

  public open fun stageName(): String = unwrap(this).getStageName()

  public open fun synth(): CloudAssembly = unwrap(this).synth().let(CloudAssembly::wrap)

  public open fun synth(options: StageSynthesisOptions): CloudAssembly =
      unwrap(this).synth(options.let(StageSynthesisOptions::unwrap)).let(CloudAssembly::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("51a65fc739ba0b8c9800ffaf94d00db702d5465092951431a38b37419a2e2a02")
  public open fun synth(options: StageSynthesisOptions.Builder.() -> Unit): CloudAssembly =
      synth(StageSynthesisOptions(options))

  @CdkDslMarker
  public interface Builder {
    public fun env(env: Environment)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3d6fb3bfd47ec19372384a721dfafbb2e623d906353b629e5d3f9b8ecc34bd33")
    public fun env(env: Environment.Builder.() -> Unit)

    public fun outdir(outdir: String)

    public fun permissionsBoundary(permissionsBoundary: PermissionsBoundary)

    public fun policyValidationBeta1(policyValidationBeta1: List<IPolicyValidationPluginBeta1>)

    public fun policyValidationBeta1(vararg policyValidationBeta1: IPolicyValidationPluginBeta1)

    public fun stageName(stageName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.Stage.Builder =
        software.amazon.awscdk.Stage.Builder.create(scope, id)

    override fun env(env: Environment) {
      cdkBuilder.env(env.let(Environment::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3d6fb3bfd47ec19372384a721dfafbb2e623d906353b629e5d3f9b8ecc34bd33")
    override fun env(env: Environment.Builder.() -> Unit): Unit = env(Environment(env))

    override fun outdir(outdir: String) {
      cdkBuilder.outdir(outdir)
    }

    override fun permissionsBoundary(permissionsBoundary: PermissionsBoundary) {
      cdkBuilder.permissionsBoundary(permissionsBoundary.let(PermissionsBoundary::unwrap))
    }

    override fun policyValidationBeta1(policyValidationBeta1: List<IPolicyValidationPluginBeta1>) {
      cdkBuilder.policyValidationBeta1(policyValidationBeta1.map(IPolicyValidationPluginBeta1::unwrap))
    }

    override fun policyValidationBeta1(vararg policyValidationBeta1: IPolicyValidationPluginBeta1):
        Unit = policyValidationBeta1(policyValidationBeta1.toList())

    override fun stageName(stageName: String) {
      cdkBuilder.stageName(stageName)
    }

    public fun build(): software.amazon.awscdk.Stage = cdkBuilder.build()
  }

  public companion object {
    public fun isStage(x: Any): Boolean = software.amazon.awscdk.Stage.isStage(x)

    public fun of(construct: IConstruct): Stage? =
        software.amazon.awscdk.Stage.of(construct.let(IConstruct::unwrap))?.let(Stage::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Stage {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Stage(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.Stage): Stage = Stage(cdkObject)

    internal fun unwrap(wrapped: Stage): software.amazon.awscdk.Stage = wrapped.cdkObject
  }
}
