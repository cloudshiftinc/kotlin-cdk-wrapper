package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface CfnResourceProps {
  /**
   * Resource properties.
   *
   * Default: - No resource properties.
   */
  public fun properties(): Map<String, Any> = unwrap(this).getProperties() ?: emptyMap()

  /**
   * CloudFormation resource type (e.g. `AWS::S3::Bucket`).
   */
  public fun type(): String

  /**
   * A builder for [CfnResourceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param properties Resource properties.
     */
    public fun properties(properties: Map<String, Any>)

    /**
     * @param type CloudFormation resource type (e.g. `AWS::S3::Bucket`). 
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnResourceProps.Builder =
        software.amazon.awscdk.CfnResourceProps.builder()

    /**
     * @param properties Resource properties.
     */
    override fun properties(properties: Map<String, Any>) {
      cdkBuilder.properties(properties)
    }

    /**
     * @param type CloudFormation resource type (e.g. `AWS::S3::Bucket`). 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.CfnResourceProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CfnResourceProps,
  ) : CdkObject(cdkObject), CfnResourceProps {
    /**
     * Resource properties.
     *
     * Default: - No resource properties.
     */
    override fun properties(): Map<String, Any> = unwrap(this).getProperties() ?: emptyMap()

    /**
     * CloudFormation resource type (e.g. `AWS::S3::Bucket`).
     */
    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnResourceProps): CfnResourceProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResourceProps): software.amazon.awscdk.CfnResourceProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.CfnResourceProps
  }
}
