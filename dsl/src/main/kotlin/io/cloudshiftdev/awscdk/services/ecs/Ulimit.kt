package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit

public interface Ulimit {
  /**
   * The hard limit for the ulimit type.
   */
  public fun hardLimit(): Number

  /**
   * The type of the ulimit.
   *
   * For more information, see
   * [UlimitName](https://docs.aws.amazon.com/cdk/api/latest/typescript/api/aws-ecs/ulimitname.html#aws_ecs_UlimitName).
   */
  public fun name(): UlimitName

  /**
   * The soft limit for the ulimit type.
   */
  public fun softLimit(): Number

  /**
   * A builder for [Ulimit]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param hardLimit The hard limit for the ulimit type. 
     */
    public fun hardLimit(hardLimit: Number)

    /**
     * @param name The type of the ulimit. 
     * For more information, see
     * [UlimitName](https://docs.aws.amazon.com/cdk/api/latest/typescript/api/aws-ecs/ulimitname.html#aws_ecs_UlimitName).
     */
    public fun name(name: UlimitName)

    /**
     * @param softLimit The soft limit for the ulimit type. 
     */
    public fun softLimit(softLimit: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.Ulimit.Builder =
        software.amazon.awscdk.services.ecs.Ulimit.builder()

    /**
     * @param hardLimit The hard limit for the ulimit type. 
     */
    override fun hardLimit(hardLimit: Number) {
      cdkBuilder.hardLimit(hardLimit)
    }

    /**
     * @param name The type of the ulimit. 
     * For more information, see
     * [UlimitName](https://docs.aws.amazon.com/cdk/api/latest/typescript/api/aws-ecs/ulimitname.html#aws_ecs_UlimitName).
     */
    override fun name(name: UlimitName) {
      cdkBuilder.name(name.let(UlimitName::unwrap))
    }

    /**
     * @param softLimit The soft limit for the ulimit type. 
     */
    override fun softLimit(softLimit: Number) {
      cdkBuilder.softLimit(softLimit)
    }

    public fun build(): software.amazon.awscdk.services.ecs.Ulimit = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.Ulimit,
  ) : Ulimit {
    /**
     * The hard limit for the ulimit type.
     */
    override fun hardLimit(): Number = unwrap(this).getHardLimit()

    /**
     * The type of the ulimit.
     *
     * For more information, see
     * [UlimitName](https://docs.aws.amazon.com/cdk/api/latest/typescript/api/aws-ecs/ulimitname.html#aws_ecs_UlimitName).
     */
    override fun name(): UlimitName = unwrap(this).getName().let(UlimitName::wrap)

    /**
     * The soft limit for the ulimit type.
     */
    override fun softLimit(): Number = unwrap(this).getSoftLimit()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): Ulimit {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.Ulimit): Ulimit =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Ulimit): software.amazon.awscdk.services.ecs.Ulimit = (wrapped as
        Wrapper).cdkObject
  }
}
