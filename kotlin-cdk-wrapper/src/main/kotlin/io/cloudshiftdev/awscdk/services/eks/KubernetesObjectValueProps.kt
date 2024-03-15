@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface KubernetesObjectValueProps {
  public fun cluster(): ICluster

  public fun jsonPath(): String

  public fun objectName(): String

  public fun objectNamespace(): String? = unwrap(this).getObjectNamespace()

  public fun objectType(): String

  public fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun cluster(cluster: ICluster)

    public fun jsonPath(jsonPath: String)

    public fun objectName(objectName: String)

    public fun objectNamespace(objectNamespace: String)

    public fun objectType(objectType: String)

    public fun timeout(timeout: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.KubernetesObjectValueProps.Builder =
        software.amazon.awscdk.services.eks.KubernetesObjectValueProps.builder()

    override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster::unwrap))
    }

    override fun jsonPath(jsonPath: String) {
      cdkBuilder.jsonPath(jsonPath)
    }

    override fun objectName(objectName: String) {
      cdkBuilder.objectName(objectName)
    }

    override fun objectNamespace(objectNamespace: String) {
      cdkBuilder.objectNamespace(objectNamespace)
    }

    override fun objectType(objectType: String) {
      cdkBuilder.objectType(objectType)
    }

    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.eks.KubernetesObjectValueProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.eks.KubernetesObjectValueProps,
  ) : CdkObject(cdkObject), KubernetesObjectValueProps {
    override fun cluster(): ICluster = unwrap(this).getCluster().let(ICluster::wrap)

    override fun jsonPath(): String = unwrap(this).getJsonPath()

    override fun objectName(): String = unwrap(this).getObjectName()

    override fun objectNamespace(): String? = unwrap(this).getObjectNamespace()

    override fun objectType(): String = unwrap(this).getObjectType()

    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): KubernetesObjectValueProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.KubernetesObjectValueProps):
        KubernetesObjectValueProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: KubernetesObjectValueProps):
        software.amazon.awscdk.services.eks.KubernetesObjectValueProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.eks.KubernetesObjectValueProps
  }
}
