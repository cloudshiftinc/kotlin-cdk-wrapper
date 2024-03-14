package io.cloudshiftdev.awscdk.services.eks

import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface ServiceAccountOptions {
  public fun annotations(): Map<String, String> = unwrap(this).getAnnotations() ?: emptyMap()

  public fun labels(): Map<String, String> = unwrap(this).getLabels() ?: emptyMap()

  public fun name(): String? = unwrap(this).getName()

  public fun namespace(): String? = unwrap(this).getNamespace()

  public interface Builder {
    public fun annotations(annotations: Map<String, String>) {
    }

    public fun labels(labels: Map<String, String>) {
    }

    public fun name(name: String) {
    }

    public fun namespace(namespace: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.ServiceAccountOptions.Builder =
        software.amazon.awscdk.services.eks.ServiceAccountOptions.builder()

    public override fun annotations(annotations: Map<String, String>) {
      cdkBuilder.annotations(annotations)
    }

    public override fun labels(labels: Map<String, String>) {
      cdkBuilder.labels(labels)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun namespace(namespace: String) {
      cdkBuilder.namespace(namespace)
    }

    public fun build(): software.amazon.awscdk.services.eks.ServiceAccountOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.eks.ServiceAccountOptions,
  ) : ServiceAccountOptions {
    public override fun annotations(): Map<String, String> = unwrap(this).getAnnotations() ?:
        emptyMap()

    public override fun labels(): Map<String, String> = unwrap(this).getLabels() ?: emptyMap()

    public override fun name(): String? = unwrap(this).getName()

    public override fun namespace(): String? = unwrap(this).getNamespace()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ServiceAccountOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.ServiceAccountOptions):
        ServiceAccountOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ServiceAccountOptions):
        software.amazon.awscdk.services.eks.ServiceAccountOptions = (wrapped as Wrapper).cdkObject
  }
}
