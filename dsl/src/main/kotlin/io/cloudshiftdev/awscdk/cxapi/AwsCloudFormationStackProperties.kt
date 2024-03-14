package io.cloudshiftdev.awscdk.cxapi

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface AwsCloudFormationStackProperties {
  /**
   * Values for CloudFormation stack parameters that should be passed when the stack is deployed.
   */
  public fun parameters(): Map<String, String> = unwrap(this).getParameters() ?: emptyMap()

  /**
   * The name to use for the CloudFormation stack.
   *
   * Default: - name derived from artifact ID
   */
  public fun stackName(): String? = unwrap(this).getStackName()

  /**
   * A file relative to the assembly root which contains the CloudFormation template for this stack.
   */
  public fun templateFile(): String

  /**
   * Whether to enable termination protection for this stack.
   *
   * Default: false
   */
  public fun terminationProtection(): Boolean? = unwrap(this).getTerminationProtection()

  /**
   * A builder for [AwsCloudFormationStackProperties]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param parameters Values for CloudFormation stack parameters that should be passed when the
     * stack is deployed.
     */
    public fun parameters(parameters: Map<String, String>)

    /**
     * @param stackName The name to use for the CloudFormation stack.
     */
    public fun stackName(stackName: String)

    /**
     * @param templateFile A file relative to the assembly root which contains the CloudFormation
     * template for this stack. 
     */
    public fun templateFile(templateFile: String)

    /**
     * @param terminationProtection Whether to enable termination protection for this stack.
     */
    public fun terminationProtection(terminationProtection: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cxapi.AwsCloudFormationStackProperties.Builder =
        software.amazon.awscdk.cxapi.AwsCloudFormationStackProperties.builder()

    /**
     * @param parameters Values for CloudFormation stack parameters that should be passed when the
     * stack is deployed.
     */
    override fun parameters(parameters: Map<String, String>) {
      cdkBuilder.parameters(parameters)
    }

    /**
     * @param stackName The name to use for the CloudFormation stack.
     */
    override fun stackName(stackName: String) {
      cdkBuilder.stackName(stackName)
    }

    /**
     * @param templateFile A file relative to the assembly root which contains the CloudFormation
     * template for this stack. 
     */
    override fun templateFile(templateFile: String) {
      cdkBuilder.templateFile(templateFile)
    }

    /**
     * @param terminationProtection Whether to enable termination protection for this stack.
     */
    override fun terminationProtection(terminationProtection: Boolean) {
      cdkBuilder.terminationProtection(terminationProtection)
    }

    public fun build(): software.amazon.awscdk.cxapi.AwsCloudFormationStackProperties =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.cxapi.AwsCloudFormationStackProperties,
  ) : CdkObject(cdkObject), AwsCloudFormationStackProperties {
    /**
     * Values for CloudFormation stack parameters that should be passed when the stack is deployed.
     */
    override fun parameters(): Map<String, String> = unwrap(this).getParameters() ?: emptyMap()

    /**
     * The name to use for the CloudFormation stack.
     *
     * Default: - name derived from artifact ID
     */
    override fun stackName(): String? = unwrap(this).getStackName()

    /**
     * A file relative to the assembly root which contains the CloudFormation template for this
     * stack.
     */
    override fun templateFile(): String = unwrap(this).getTemplateFile()

    /**
     * Whether to enable termination protection for this stack.
     *
     * Default: false
     */
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
