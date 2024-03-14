package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.constructs.Construct

public interface IMachineImage {
  /**
   * Return the image to use in the given context.
   *
   * @param scope 
   */
  public fun image(scope: Construct): MachineImageConfig

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.IMachineImage,
  ) : CdkObject(cdkObject), IMachineImage {
    /**
     * Return the image to use in the given context.
     *
     * @param scope 
     */
    override fun image(scope: Construct): MachineImageConfig =
        unwrap(this).getImage(scope.let(Construct::unwrap)).let(MachineImageConfig::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IMachineImage): IMachineImage =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IMachineImage): software.amazon.awscdk.services.ec2.IMachineImage =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.IMachineImage
  }
}