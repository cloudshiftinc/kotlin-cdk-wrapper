@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cxapi

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface AwsCloudFormationStackProperties {
  public fun parameters(): Map<String, String> = unwrap(this).getParameters() ?: emptyMap()

  public fun stackName(): String? = unwrap(this).getStackName()

  public fun templateFile(): String

  public fun terminationProtection(): Boolean? = unwrap(this).getTerminationProtection()

  @CdkDslMarker
  public interface Builder {
    public fun parameters(parameters: Map<String, String>)

    public fun stackName(stackName: String)

    public fun templateFile(templateFile: String)

    public fun terminationProtection(terminationProtection: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cxapi.AwsCloudFormationStackProperties.Builder =
        software.amazon.awscdk.cxapi.AwsCloudFormationStackProperties.builder()

    override fun parameters(parameters: Map<String, String>) {
      cdkBuilder.parameters(parameters)
    }

    override fun stackName(stackName: String) {
      cdkBuilder.stackName(stackName)
    }

    override fun templateFile(templateFile: String) {
      cdkBuilder.templateFile(templateFile)
    }

    override fun terminationProtection(terminationProtection: Boolean) {
      cdkBuilder.terminationProtection(terminationProtection)
    }

    public fun build(): software.amazon.awscdk.cxapi.AwsCloudFormationStackProperties =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.cxapi.AwsCloudFormationStackProperties,
  ) : CdkObject(cdkObject), AwsCloudFormationStackProperties {
    override fun parameters(): Map<String, String> = unwrap(this).getParameters() ?: emptyMap()

    override fun stackName(): String? = unwrap(this).getStackName()

    override fun templateFile(): String = unwrap(this).getTemplateFile()

    override fun terminationProtection(): Boolean? = unwrap(this).getTerminationProtection()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AwsCloudFormationStackProperties {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cxapi.AwsCloudFormationStackProperties):
        AwsCloudFormationStackProperties = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AwsCloudFormationStackProperties):
        software.amazon.awscdk.cxapi.AwsCloudFormationStackProperties = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cxapi.AwsCloudFormationStackProperties
  }
}
