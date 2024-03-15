@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface PolicyViolatingResourceBeta1 {
  public fun locations(): List<String>

  public fun resourceLogicalId(): String

  public fun templatePath(): String

  @CdkDslMarker
  public interface Builder {
    public fun locations(locations: List<String>)

    public fun locations(vararg locations: String)

    public fun resourceLogicalId(resourceLogicalId: String)

    public fun templatePath(templatePath: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.PolicyViolatingResourceBeta1.Builder =
        software.amazon.awscdk.PolicyViolatingResourceBeta1.builder()

    override fun locations(locations: List<String>) {
      cdkBuilder.locations(locations)
    }

    override fun locations(vararg locations: String): Unit = locations(locations.toList())

    override fun resourceLogicalId(resourceLogicalId: String) {
      cdkBuilder.resourceLogicalId(resourceLogicalId)
    }

    override fun templatePath(templatePath: String) {
      cdkBuilder.templatePath(templatePath)
    }

    public fun build(): software.amazon.awscdk.PolicyViolatingResourceBeta1 = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.PolicyViolatingResourceBeta1,
  ) : CdkObject(cdkObject), PolicyViolatingResourceBeta1 {
    override fun locations(): List<String> = unwrap(this).getLocations()

    override fun resourceLogicalId(): String = unwrap(this).getResourceLogicalId()

    override fun templatePath(): String = unwrap(this).getTemplatePath()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): PolicyViolatingResourceBeta1 {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.PolicyViolatingResourceBeta1):
        PolicyViolatingResourceBeta1 = Wrapper(cdkObject)

    internal fun unwrap(wrapped: PolicyViolatingResourceBeta1):
        software.amazon.awscdk.PolicyViolatingResourceBeta1 = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.PolicyViolatingResourceBeta1
  }
}
