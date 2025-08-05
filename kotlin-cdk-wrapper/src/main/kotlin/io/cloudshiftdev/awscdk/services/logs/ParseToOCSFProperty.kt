@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Processor to parse events from CloudTrail, Route53Resolver, VPCFlow, EKSAudit and AWSWAF into
 * OCSF V1.1 format.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * ParseToOCSFProperty parseToOCSFProperty = ParseToOCSFProperty.builder()
 * .eventSource(OCSFSourceType.CLOUD_TRAIL)
 * .ocsfVersion(OCSFVersion.V1_1)
 * // the properties below are optional
 * .source("source")
 * .build();
 * ```
 */
public interface ParseToOCSFProperty {
  /**
   * Type of input log event source to convert to OCSF format.
   */
  public fun eventSource(): OCSFSourceType

  /**
   * Version of OCSF schema to convert to.
   */
  public fun ocsfVersion(): OCSFVersion

  /**
   * Path to the field in the log event that will be parsed.
   *
   * Use dot notation to access child fields.
   *
   * Default: '@message'
   */
  public fun source(): String? = unwrap(this).getSource()

  /**
   * A builder for [ParseToOCSFProperty]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param eventSource Type of input log event source to convert to OCSF format. 
     */
    public fun eventSource(eventSource: OCSFSourceType)

    /**
     * @param ocsfVersion Version of OCSF schema to convert to. 
     */
    public fun ocsfVersion(ocsfVersion: OCSFVersion)

    /**
     * @param source Path to the field in the log event that will be parsed.
     * Use dot notation to access child fields.
     */
    public fun source(source: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.ParseToOCSFProperty.Builder =
        software.amazon.awscdk.services.logs.ParseToOCSFProperty.builder()

    /**
     * @param eventSource Type of input log event source to convert to OCSF format. 
     */
    override fun eventSource(eventSource: OCSFSourceType) {
      cdkBuilder.eventSource(eventSource.let(OCSFSourceType.Companion::unwrap))
    }

    /**
     * @param ocsfVersion Version of OCSF schema to convert to. 
     */
    override fun ocsfVersion(ocsfVersion: OCSFVersion) {
      cdkBuilder.ocsfVersion(ocsfVersion.let(OCSFVersion.Companion::unwrap))
    }

    /**
     * @param source Path to the field in the log event that will be parsed.
     * Use dot notation to access child fields.
     */
    override fun source(source: String) {
      cdkBuilder.source(source)
    }

    public fun build(): software.amazon.awscdk.services.logs.ParseToOCSFProperty =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.logs.ParseToOCSFProperty,
  ) : CdkObject(cdkObject),
      ParseToOCSFProperty {
    /**
     * Type of input log event source to convert to OCSF format.
     */
    override fun eventSource(): OCSFSourceType =
        unwrap(this).getEventSource().let(OCSFSourceType::wrap)

    /**
     * Version of OCSF schema to convert to.
     */
    override fun ocsfVersion(): OCSFVersion = unwrap(this).getOcsfVersion().let(OCSFVersion::wrap)

    /**
     * Path to the field in the log event that will be parsed.
     *
     * Use dot notation to access child fields.
     *
     * Default: '@message'
     */
    override fun source(): String? = unwrap(this).getSource()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ParseToOCSFProperty {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.ParseToOCSFProperty):
        ParseToOCSFProperty = CdkObjectWrappers.wrap(cdkObject) as? ParseToOCSFProperty ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ParseToOCSFProperty):
        software.amazon.awscdk.services.logs.ParseToOCSFProperty = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.logs.ParseToOCSFProperty
  }
}
