package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public open class GenericLinuxImage internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.GenericLinuxImage,
) : CdkObject(cdkObject), IMachineImage {
  /**
   * Return the image to use in the given context.
   *
   * @param scope 
   */
  public override fun image(scope: Construct): MachineImageConfig =
      unwrap(this).getImage(scope.let(Construct::unwrap)).let(MachineImageConfig::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.GenericLinuxImage].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Initial user data.
     *
     * Default: - Empty UserData for Linux machines
     *
     * @param userData Initial user data. 
     */
    public fun userData(userData: UserData)
  }

  private class BuilderImpl(
    amiMap: Map<String, String>,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.GenericLinuxImage.Builder =
        software.amazon.awscdk.services.ec2.GenericLinuxImage.Builder.create(amiMap)

    /**
     * Initial user data.
     *
     * Default: - Empty UserData for Linux machines
     *
     * @param userData Initial user data. 
     */
    override fun userData(userData: UserData) {
      cdkBuilder.userData(userData.let(UserData::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.GenericLinuxImage = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(amiMap: Map<String, String>, block: Builder.() -> Unit = {}):
        GenericLinuxImage {
      val builderImpl = BuilderImpl(amiMap)
      return GenericLinuxImage(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.GenericLinuxImage):
        GenericLinuxImage = GenericLinuxImage(cdkObject)

    internal fun unwrap(wrapped: GenericLinuxImage):
        software.amazon.awscdk.services.ec2.GenericLinuxImage = wrapped.cdkObject
  }
}
