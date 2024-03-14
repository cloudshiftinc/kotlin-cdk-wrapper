package io.cloudshiftdev.awscdk.services.eks

import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class AlbController internal constructor(
  private val cdkObject: software.amazon.awscdk.services.eks.AlbController,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  public interface Builder {
    public fun cluster(cluster: Cluster) {
    }

    public fun policy(policy: Any) {
    }

    public fun repository(repository: String) {
    }

    public fun version(version: AlbControllerVersion) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.AlbController.Builder =
        software.amazon.awscdk.services.eks.AlbController.Builder.create(scope, id)

    public override fun cluster(cluster: Cluster) {
      cdkBuilder.cluster(cluster.let(Cluster::unwrap))
    }

    public override fun policy(policy: Any) {
      cdkBuilder.policy(policy)
    }

    public override fun repository(repository: String) {
      cdkBuilder.repository(repository)
    }

    public override fun version(version: AlbControllerVersion) {
      cdkBuilder.version(version.let(AlbControllerVersion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.eks.AlbController = cdkBuilder.build()
  }

  public companion object {
    public open fun create(scope: CloudshiftdevConstructsConstruct, props: AlbControllerProps):
        AlbController =
        software.amazon.awscdk.services.eks.AlbController.create(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        props.let(AlbControllerProps::unwrap)).let(AlbController::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3abec2df923af4b086c4ed5b4438c030eef16ecfd9e5fa74e3b42aaa7207f58f")
    public open fun create(scope: CloudshiftdevConstructsConstruct,
        props: AlbControllerProps.Builder.() -> Unit): AlbController = create(scope,
        AlbControllerProps(props))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): AlbController {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return AlbController(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.AlbController): AlbController =
        AlbController(cdkObject)

    internal fun unwrap(wrapped: AlbController): software.amazon.awscdk.services.eks.AlbController =
        wrapped.cdkObject
  }
}
