package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.constructs.Construct
import kotlin.Boolean
import kotlin.String

public interface ISource {
    /**  */
    public fun badgeSupported(): Boolean

    /**
     * @param scope
     * @param project
     */
    public fun bind(scope: Construct, project: IProject): SourceConfig

    /**  */
    public fun identifier(): String? = unwrap(this).getIdentifier()

    /**  */
    public fun type(): String

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.codebuild.ISource,
    ) : ISource {
        /**  */
        override fun badgeSupported(): Boolean = unwrap(this).getBadgeSupported()

        /**
         * @param scope
         * @param project
         */
        override fun bind(scope: Construct, project: IProject): SourceConfig =
            unwrap(this)
                .bind(scope.let(Construct::unwrap), project.let(IProject::unwrap))
                .let(SourceConfig::wrap)

        /**  */
        override fun identifier(): String? = unwrap(this).getIdentifier()

        /**  */
        override fun type(): String = unwrap(this).getType()
    }

    public companion object {
        init {}

        internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.ISource): ISource =
            Wrapper(cdkObject)

        internal fun unwrap(wrapped: ISource): software.amazon.awscdk.services.codebuild.ISource =
            (wrapped as Wrapper).cdkObject
    }
}
