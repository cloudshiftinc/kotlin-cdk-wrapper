package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface Attribute {
  /**
   * The name of an attribute.
   */
  public fun name(): String

  /**
   * The data type of an attribute.
   */
  public fun type(): AttributeType

  /**
   * A builder for [Attribute]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param name The name of an attribute. 
     */
    public fun name(name: String)

    /**
     * @param type The data type of an attribute. 
     */
    public fun type(type: AttributeType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dynamodb.Attribute.Builder =
        software.amazon.awscdk.services.dynamodb.Attribute.builder()

    /**
     * @param name The name of an attribute. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param type The data type of an attribute. 
     */
    override fun type(type: AttributeType) {
      cdkBuilder.type(type.let(AttributeType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.dynamodb.Attribute = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.dynamodb.Attribute,
  ) : CdkObject(cdkObject), Attribute {
    /**
     * The name of an attribute.
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The data type of an attribute.
     */
    override fun type(): AttributeType = unwrap(this).getType().let(AttributeType::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Attribute {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.Attribute): Attribute =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Attribute): software.amazon.awscdk.services.dynamodb.Attribute =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.dynamodb.Attribute
  }
}
