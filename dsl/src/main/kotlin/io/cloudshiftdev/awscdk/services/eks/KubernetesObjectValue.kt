package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.Duration
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class KubernetesObjectValue internal constructor(
  private val cdkObject: software.amazon.awscdk.services.eks.KubernetesObjectValue,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  public open fun `value`(): String = unwrap(this).getValue()

  public interface Builder {
    public fun cluster(cluster: ICluster) {
    }

    public fun jsonPath(jsonPath: String) {
    }

    public fun objectName(objectName: String) {
    }

    public fun objectNamespace(objectNamespace: String) {
    }

    public fun objectType(objectType: String) {
    }

    public fun timeout(timeout: Duration) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.KubernetesObjectValue.Builder =
        software.amazon.awscdk.services.eks.KubernetesObjectValue.Builder.create(scope, id)

    public override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster::unwrap))
    }

    public override fun jsonPath(jsonPath: String) {
      cdkBuilder.jsonPath(jsonPath)
    }

    public override fun objectName(objectName: String) {
      cdkBuilder.objectName(objectName)
    }

    public override fun objectNamespace(objectNamespace: String) {
      cdkBuilder.objectNamespace(objectNamespace)
    }

    public override fun objectType(objectType: String) {
      cdkBuilder.objectType(objectType)
    }

    public override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.eks.KubernetesObjectValue =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): KubernetesObjectValue {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return KubernetesObjectValue(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.KubernetesObjectValue):
        KubernetesObjectValue = KubernetesObjectValue(cdkObject)

    internal fun unwrap(wrapped: KubernetesObjectValue):
        software.amazon.awscdk.services.eks.KubernetesObjectValue = wrapped.cdkObject
  }
}
