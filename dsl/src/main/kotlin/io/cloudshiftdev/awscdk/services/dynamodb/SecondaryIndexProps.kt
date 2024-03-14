package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface SecondaryIndexProps {
  /**
   * The name of the secondary index.
   */
  public fun indexName(): String

  /**
   * The non-key attributes that are projected into the secondary index.
   *
   * Default: - No additional attributes
   */
  public fun nonKeyAttributes(): List<String> = unwrap(this).getNonKeyAttributes() ?: emptyList()

  /**
   * The set of attributes that are projected into the secondary index.
   *
   * Default: ALL
   */
  public fun projectionType(): ProjectionType? =
      unwrap(this).getProjectionType()?.let(ProjectionType::wrap)

  /**
   * A builder for [SecondaryIndexProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param indexName The name of the secondary index. 
     */
    public fun indexName(indexName: String)

    /**
     * @param nonKeyAttributes The non-key attributes that are projected into the secondary index.
     */
    public fun nonKeyAttributes(nonKeyAttributes: List<String>)

    /**
     * @param nonKeyAttributes The non-key attributes that are projected into the secondary index.
     */
    public fun nonKeyAttributes(vararg nonKeyAttributes: String)

    /**
     * @param projectionType The set of attributes that are projected into the secondary index.
     */
    public fun projectionType(projectionType: ProjectionType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dynamodb.SecondaryIndexProps.Builder =
        software.amazon.awscdk.services.dynamodb.SecondaryIndexProps.builder()

    /**
     * @param indexName The name of the secondary index. 
     */
    override fun indexName(indexName: String) {
      cdkBuilder.indexName(indexName)
    }

    /**
     * @param nonKeyAttributes The non-key attributes that are projected into the secondary index.
     */
    override fun nonKeyAttributes(nonKeyAttributes: List<String>) {
      cdkBuilder.nonKeyAttributes(nonKeyAttributes)
    }

    /**
     * @param nonKeyAttributes The non-key attributes that are projected into the secondary index.
     */
    override fun nonKeyAttributes(vararg nonKeyAttributes: String): Unit =
        nonKeyAttributes(nonKeyAttributes.toList())

    /**
     * @param projectionType The set of attributes that are projected into the secondary index.
     */
    override fun projectionType(projectionType: ProjectionType) {
      cdkBuilder.projectionType(projectionType.let(ProjectionType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.dynamodb.SecondaryIndexProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.dynamodb.SecondaryIndexProps,
  ) : SecondaryIndexProps {
    /**
     * The name of the secondary index.
     */
    override fun indexName(): String = unwrap(this).getIndexName()

    /**
     * The non-key attributes that are projected into the secondary index.
     *
     * Default: - No additional attributes
     */
    override fun nonKeyAttributes(): List<String> = unwrap(this).getNonKeyAttributes() ?:
        emptyList()

    /**
     * The set of attributes that are projected into the secondary index.
     *
     * Default: ALL
     */
    override fun projectionType(): ProjectionType? =
        unwrap(this).getProjectionType()?.let(ProjectionType::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): SecondaryIndexProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.SecondaryIndexProps):
        SecondaryIndexProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SecondaryIndexProps):
        software.amazon.awscdk.services.dynamodb.SecondaryIndexProps = (wrapped as
        Wrapper).cdkObject
  }
}
