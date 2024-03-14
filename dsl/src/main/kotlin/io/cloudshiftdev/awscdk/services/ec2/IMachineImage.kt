package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.constructs.Construct

public interface IMachineImage {
  /**
   * Return the image to use in the given context.
   *
   * @param scope 
   */
  public fun image(scope: Construct): MachineImageConfig

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.IMachineImage,
  ) : IMachineImage {
    /**
     * Return the image to use in the given context.
     *
     * @param scope 
     */
    override fun image(scope: Construct): MachineImageConfig =
        unwrap(this).getImage(scope.let(Construct::unwrap)).let(MachineImageConfig::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IMachineImage): IMachineImage =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IMachineImage): software.amazon.awscdk.services.ec2.IMachineImage =
        (wrapped as Wrapper).cdkObject
  }
}
