package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface PolicyViolatingResourceBeta1 {
  /**
   * The locations in the CloudFormation template that pose the violations.
   */
  public fun locations(): List<String>

  /**
   * The logical ID of the resource in the CloudFormation template.
   */
  public fun resourceLogicalId(): String

  /**
   * The path to the CloudFormation template that contains this resource.
   */
  public fun templatePath(): String

  /**
   * A builder for [PolicyViolatingResourceBeta1]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param locations The locations in the CloudFormation template that pose the violations. 
     */
    public fun locations(locations: List<String>)

    /**
     * @param locations The locations in the CloudFormation template that pose the violations. 
     */
    public fun locations(vararg locations: String)

    /**
     * @param resourceLogicalId The logical ID of the resource in the CloudFormation template. 
     */
    public fun resourceLogicalId(resourceLogicalId: String)

    /**
     * @param templatePath The path to the CloudFormation template that contains this resource. 
     */
    public fun templatePath(templatePath: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.PolicyViolatingResourceBeta1.Builder =
        software.amazon.awscdk.PolicyViolatingResourceBeta1.builder()

    /**
     * @param locations The locations in the CloudFormation template that pose the violations. 
     */
    override fun locations(locations: List<String>) {
      cdkBuilder.locations(locations)
    }

    /**
     * @param locations The locations in the CloudFormation template that pose the violations. 
     */
    override fun locations(vararg locations: String): Unit = locations(locations.toList())

    /**
     * @param resourceLogicalId The logical ID of the resource in the CloudFormation template. 
     */
    override fun resourceLogicalId(resourceLogicalId: String) {
      cdkBuilder.resourceLogicalId(resourceLogicalId)
    }

    /**
     * @param templatePath The path to the CloudFormation template that contains this resource. 
     */
    override fun templatePath(templatePath: String) {
      cdkBuilder.templatePath(templatePath)
    }

    public fun build(): software.amazon.awscdk.PolicyViolatingResourceBeta1 = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.PolicyViolatingResourceBeta1,
  ) : PolicyViolatingResourceBeta1 {
    /**
     * The locations in the CloudFormation template that pose the violations.
     */
    override fun locations(): List<String> = unwrap(this).getLocations()

    /**
     * The logical ID of the resource in the CloudFormation template.
     */
    override fun resourceLogicalId(): String = unwrap(this).getResourceLogicalId()

    /**
     * The path to the CloudFormation template that contains this resource.
     */
    override fun templatePath(): String = unwrap(this).getTemplatePath()
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
