package io.cloudshiftdev.awscdk.services.apigatewayv2

import kotlin.String
import kotlin.collections.Map

public open class ParameterMapping
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.apigatewayv2.ParameterMapping,
) {
    /**
     * Creates a mapping to append a header.
     *
     * @param name
     * @param value
     */
    public open fun appendHeader(name: String, `value`: MappingValue): ParameterMapping =
        unwrap(this)
            .appendHeader(name, `value`.let(MappingValue::unwrap))
            .let(ParameterMapping::wrap)

    /**
     * Creates a mapping to append a query string.
     *
     * @param name
     * @param value
     */
    public open fun appendQueryString(name: String, `value`: MappingValue): ParameterMapping =
        unwrap(this)
            .appendQueryString(name, `value`.let(MappingValue::unwrap))
            .let(ParameterMapping::wrap)

    /**
     * Creates a custom mapping.
     *
     * @param key
     * @param value
     */
    public open fun custom(key: String, `value`: String): ParameterMapping =
        unwrap(this).custom(key, `value`).let(ParameterMapping::wrap)

    /** Represents all created parameter mappings. */
    public open fun mappings(): Map<String, String> = unwrap(this).getMappings() ?: emptyMap()

    /**
     * Creates a mapping to overwrite a header.
     *
     * @param name
     * @param value
     */
    public open fun overwriteHeader(name: String, `value`: MappingValue): ParameterMapping =
        unwrap(this)
            .overwriteHeader(name, `value`.let(MappingValue::unwrap))
            .let(ParameterMapping::wrap)

    /**
     * Creates a mapping to overwrite a path.
     *
     * @param value
     */
    public open fun overwritePath(`value`: MappingValue): ParameterMapping =
        unwrap(this).overwritePath(`value`.let(MappingValue::unwrap)).let(ParameterMapping::wrap)

    /**
     * Creates a mapping to overwrite a querystring.
     *
     * @param name
     * @param value
     */
    public open fun overwriteQueryString(name: String, `value`: MappingValue): ParameterMapping =
        unwrap(this)
            .overwriteQueryString(name, `value`.let(MappingValue::unwrap))
            .let(ParameterMapping::wrap)

    /**
     * Creates a mapping to remove a header.
     *
     * @param name
     */
    public open fun removeHeader(name: String): ParameterMapping =
        unwrap(this).removeHeader(name).let(ParameterMapping::wrap)

    /**
     * Creates a mapping to remove a querystring.
     *
     * @param name
     */
    public open fun removeQueryString(name: String): ParameterMapping =
        unwrap(this).removeQueryString(name).let(ParameterMapping::wrap)

    public companion object {
        public fun fromObject(obj: Map<String, MappingValue>): ParameterMapping =
            software.amazon.awscdk.services.apigatewayv2.ParameterMapping.fromObject(
                    obj.mapValues { MappingValue.unwrap(it.value) }
                )
                .let(ParameterMapping::wrap)

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.apigatewayv2.ParameterMapping
        ): ParameterMapping = ParameterMapping(cdkObject)

        internal fun unwrap(
            wrapped: ParameterMapping
        ): software.amazon.awscdk.services.apigatewayv2.ParameterMapping = wrapped.cdkObject
    }
}
