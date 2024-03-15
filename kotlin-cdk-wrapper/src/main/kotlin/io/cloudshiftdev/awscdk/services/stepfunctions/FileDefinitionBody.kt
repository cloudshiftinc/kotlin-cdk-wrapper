@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.AssetHashType
import io.cloudshiftdev.awscdk.BundlingOptions
import io.cloudshiftdev.awscdk.IgnoreMode
import io.cloudshiftdev.awscdk.SymlinkFollowMode
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.constructs.Construct
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public open class FileDefinitionBody internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.stepfunctions.FileDefinitionBody,
) : DefinitionBody(cdkObject) {
  public override fun bind(
    scope: Construct,
    _sfnPrincipal: IPrincipal,
    _sfnProps: StateMachineProps,
  ): DefinitionConfig = unwrap(this).bind(scope.let(Construct::unwrap),
      _sfnPrincipal.let(IPrincipal::unwrap),
      _sfnProps.let(StateMachineProps::unwrap)).let(DefinitionConfig::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d2dbd4d1e5f21bba5dd51d75253d432be0ee512a924449cbb7efb61b2d333163")
  public override fun bind(
    scope: Construct,
    _sfnPrincipal: IPrincipal,
    _sfnProps: StateMachineProps.Builder.() -> Unit,
  ): DefinitionConfig = bind(scope, _sfnPrincipal, StateMachineProps(_sfnProps))

  public override fun bind(
    scope: Construct,
    _sfnPrincipal: IPrincipal,
    _sfnProps: StateMachineProps,
    _graph: StateGraph,
  ): DefinitionConfig = unwrap(this).bind(scope.let(Construct::unwrap),
      _sfnPrincipal.let(IPrincipal::unwrap), _sfnProps.let(StateMachineProps::unwrap),
      _graph.let(StateGraph::unwrap)).let(DefinitionConfig::wrap)

  public open fun path(): String = unwrap(this).getPath()

  @CdkDslMarker
  public interface Builder {
    public fun assetHash(assetHash: String)

    public fun assetHashType(assetHashType: AssetHashType)

    public fun bundling(bundling: BundlingOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("625386c228742d36732516113386b44af2294e14e8626bf8d69b52efd5c84c74")
    public fun bundling(bundling: BundlingOptions.Builder.() -> Unit)

    public fun deployTime(deployTime: Boolean)

    public fun exclude(exclude: List<String>)

    public fun exclude(vararg exclude: String)

    public fun followSymlinks(followSymlinks: SymlinkFollowMode)

    public fun ignoreMode(ignoreMode: IgnoreMode)

    public fun readers(readers: List<IGrantable>)

    public fun readers(vararg readers: IGrantable)
  }

  private class BuilderImpl(
    path: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.FileDefinitionBody.Builder
        = software.amazon.awscdk.services.stepfunctions.FileDefinitionBody.Builder.create(path)

    override fun assetHash(assetHash: String) {
      cdkBuilder.assetHash(assetHash)
    }

    override fun assetHashType(assetHashType: AssetHashType) {
      cdkBuilder.assetHashType(assetHashType.let(AssetHashType::unwrap))
    }

    override fun bundling(bundling: BundlingOptions) {
      cdkBuilder.bundling(bundling.let(BundlingOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("625386c228742d36732516113386b44af2294e14e8626bf8d69b52efd5c84c74")
    override fun bundling(bundling: BundlingOptions.Builder.() -> Unit): Unit =
        bundling(BundlingOptions(bundling))

    override fun deployTime(deployTime: Boolean) {
      cdkBuilder.deployTime(deployTime)
    }

    override fun exclude(exclude: List<String>) {
      cdkBuilder.exclude(exclude)
    }

    override fun exclude(vararg exclude: String): Unit = exclude(exclude.toList())

    override fun followSymlinks(followSymlinks: SymlinkFollowMode) {
      cdkBuilder.followSymlinks(followSymlinks.let(SymlinkFollowMode::unwrap))
    }

    override fun ignoreMode(ignoreMode: IgnoreMode) {
      cdkBuilder.ignoreMode(ignoreMode.let(IgnoreMode::unwrap))
    }

    override fun readers(readers: List<IGrantable>) {
      cdkBuilder.readers(readers.map(IGrantable::unwrap))
    }

    override fun readers(vararg readers: IGrantable): Unit = readers(readers.toList())

    public fun build(): software.amazon.awscdk.services.stepfunctions.FileDefinitionBody =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(path: String, block: Builder.() -> Unit = {}): FileDefinitionBody {
      val builderImpl = BuilderImpl(path)
      return FileDefinitionBody(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.FileDefinitionBody):
        FileDefinitionBody = FileDefinitionBody(cdkObject)

    internal fun unwrap(wrapped: FileDefinitionBody):
        software.amazon.awscdk.services.stepfunctions.FileDefinitionBody = wrapped.cdkObject
  }
}
