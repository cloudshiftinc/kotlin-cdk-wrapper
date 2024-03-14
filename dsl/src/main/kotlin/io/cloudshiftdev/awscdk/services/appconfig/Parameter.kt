package io.cloudshiftdev.awscdk.services.appconfig

import kotlin.Boolean
import kotlin.String

public open class Parameter
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.appconfig.Parameter,
) {
    /** The description of the parameter. */
    public open fun description(): String? = unwrap(this).getDescription()

    /** A boolean that indicates if the parameter is required or optional. */
    public open fun isRequired(): Boolean = unwrap(this).getIsRequired()

    /** The name of the parameter. */
    public open fun name(): String = unwrap(this).getName()

    /** The value of the parameter. */
    public open fun `value`(): String? = unwrap(this).getValue()

    public companion object {
        public fun notRequired(name: String): Parameter =
            software.amazon.awscdk.services.appconfig.Parameter.notRequired(name)
                .let(Parameter::wrap)

        public fun notRequired(name: String, `value`: String): Parameter =
            software.amazon.awscdk.services.appconfig.Parameter.notRequired(name, `value`)
                .let(Parameter::wrap)

        public fun notRequired(
            name: String,
            `value`: String,
            description: String,
        ): Parameter =
            software.amazon.awscdk.services.appconfig.Parameter.notRequired(
                    name,
                    `value`,
                    description
                )
                .let(Parameter::wrap)

        public fun required(name: String, `value`: String): Parameter =
            software.amazon.awscdk.services.appconfig.Parameter.required(name, `value`)
                .let(Parameter::wrap)

        public fun required(
            name: String,
            `value`: String,
            description: String,
        ): Parameter =
            software.amazon.awscdk.services.appconfig.Parameter.required(name, `value`, description)
                .let(Parameter::wrap)

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.appconfig.Parameter
        ): Parameter = Parameter(cdkObject)

        internal fun unwrap(
            wrapped: Parameter
        ): software.amazon.awscdk.services.appconfig.Parameter = wrapped.cdkObject
    }
}
