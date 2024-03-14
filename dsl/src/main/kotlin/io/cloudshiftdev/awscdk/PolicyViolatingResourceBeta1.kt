package io.cloudshiftdev.awscdk

import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface PolicyViolatingResourceBeta1 {
  public fun locations(): List<String>

  public fun resourceLogicalId(): String

  public fun templatePath(): String

  public interface Builder {
    public fun locations(locations: List<String>) {
    }

    public fun resourceLogicalId(resourceLogicalId: String) {
    }

    public fun templatePath(templatePath: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.PolicyViolatingResourceBeta1.Builder =
        software.amazon.awscdk.PolicyViolatingResourceBeta1.builder()

    public override fun locations(locations: List<String>) {
      cdkBuilder.locations(locations)
    }

    public override fun resourceLogicalId(resourceLogicalId: String) {
      cdkBuilder.resourceLogicalId(resourceLogicalId)
    }

    public override fun templatePath(templatePath: String) {
      cdkBuilder.templatePath(templatePath)
    }

    public fun build(): software.amazon.awscdk.PolicyViolatingResourceBeta1 = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.PolicyViolatingResourceBeta1,
  ) : PolicyViolatingResourceBeta1 {
    public override fun locations(): List<String> = unwrap(this).getLocations() ?: emptyList()

    public override fun resourceLogicalId(): String = unwrap(this).getResourceLogicalId()

    public override fun templatePath(): String = unwrap(this).getTemplatePath()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): PolicyViolatingResourceBeta1 {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.PolicyViolatingResourceBeta1):
        PolicyViolatingResourceBeta1 = Wrapper(cdkObject)

    internal fun unwrap(wrapped: PolicyViolatingResourceBeta1):
        software.amazon.awscdk.PolicyViolatingResourceBeta1 = (wrapped as Wrapper).cdkObject
  }
}
