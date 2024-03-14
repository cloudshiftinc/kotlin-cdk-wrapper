package io.cloudshiftdev.awscdk.services.controltower

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnLandingZoneProps {
  /**
   * The landing zone `manifest.yaml` text file that specifies the landing zone configurations.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-landingzone.html#cfn-controltower-landingzone-manifest)
   */
  public fun manifest(): Any

  /**
   * Tags to be applied to the landing zone.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-landingzone.html#cfn-controltower-landingzone-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The landing zone's current deployed version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-landingzone.html#cfn-controltower-landingzone-version)
   */
  public fun version(): String

  /**
   * A builder for [CfnLandingZoneProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param manifest The landing zone `manifest.yaml` text file that specifies the landing zone
     * configurations. 
     */
    public fun manifest(manifest: Any)

    /**
     * @param tags Tags to be applied to the landing zone.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Tags to be applied to the landing zone.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param version The landing zone's current deployed version. 
     */
    public fun version(version: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.controltower.CfnLandingZoneProps.Builder
        = software.amazon.awscdk.services.controltower.CfnLandingZoneProps.builder()

    /**
     * @param manifest The landing zone `manifest.yaml` text file that specifies the landing zone
     * configurations. 
     */
    override fun manifest(manifest: Any) {
      cdkBuilder.manifest(manifest)
    }

    /**
     * @param tags Tags to be applied to the landing zone.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Tags to be applied to the landing zone.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param version The landing zone's current deployed version. 
     */
    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.controltower.CfnLandingZoneProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.controltower.CfnLandingZoneProps,
  ) : CdkObject(cdkObject), CfnLandingZoneProps {
    /**
     * The landing zone `manifest.yaml` text file that specifies the landing zone configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-landingzone.html#cfn-controltower-landingzone-manifest)
     */
    override fun manifest(): Any = unwrap(this).getManifest()

    /**
     * Tags to be applied to the landing zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-landingzone.html#cfn-controltower-landingzone-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The landing zone's current deployed version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-landingzone.html#cfn-controltower-landingzone-version)
     */
    override fun version(): String = unwrap(this).getVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLandingZoneProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.controltower.CfnLandingZoneProps):
        CfnLandingZoneProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLandingZoneProps):
        software.amazon.awscdk.services.controltower.CfnLandingZoneProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.controltower.CfnLandingZoneProps
  }
}
